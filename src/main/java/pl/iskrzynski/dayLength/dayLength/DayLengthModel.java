package pl.iskrzynski.dayLength.dayLength;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalTime;


@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class DayLengthModel {
    private final LocalTime sunrise;
    private final LocalTime sunset;

    public DayLengthModel(){
        this.sunrise = LocalTime.ofSecondOfDay(0);
        this.sunset = LocalTime.ofSecondOfDay(0);
    }
}
