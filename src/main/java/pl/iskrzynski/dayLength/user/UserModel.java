package pl.iskrzynski.dayLength.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class UserModel {
    private final String ip;
    private LocalDateTime lastRequest;
    private LocalDateTime firstRequest;
    private int requestCounter;
}
