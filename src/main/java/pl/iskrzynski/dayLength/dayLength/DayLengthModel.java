package pl.iskrzynski.dayLength.dayLength;

import lombok.*;

import java.time.LocalTime;


@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class DayLengthModel {
    private final LocalTime sunriseTime;
    private final LocalTime sunsetTime;

    public DayLengthModel(){
        this.sunriseTime = LocalTime.ofSecondOfDay(0);
        this.sunsetTime= LocalTime.ofSecondOfDay(0);
    }
}
