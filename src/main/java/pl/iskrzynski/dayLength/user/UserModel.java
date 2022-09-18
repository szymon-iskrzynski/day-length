package pl.iskrzynski.dayLength.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserModel {
    private final String ip = "0";
    private LocalDateTime lastRequest;
    private LocalDateTime firstRequest;
    private int requestCounter;
}
