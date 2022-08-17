package pl.iskrzynski.dayLength;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalTime;

@SuppressWarnings("ClassCanBeRecord")
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class DayLengthModel {
    private final LocalTime sunriseTime;
    private final LocalTime sunsetTime;
}
