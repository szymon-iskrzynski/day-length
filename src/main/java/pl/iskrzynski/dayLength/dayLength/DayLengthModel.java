package pl.iskrzynski.dayLength.dayLength;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalTime;


@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class DayLengthModel {
    @JsonProperty("UTC_sunrise")
    private final LocalTime sunrise;
    @JsonProperty("UTC_sunset")
    private final LocalTime sunset;

    public DayLengthModel(){
        this.sunrise = LocalTime.ofSecondOfDay(0);
        this.sunset = LocalTime.ofSecondOfDay(0);
    }
}
