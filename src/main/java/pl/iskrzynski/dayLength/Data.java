package pl.iskrzynski.dayLength;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import pl.iskrzynski.dayLength.dayLength.DayLengthModel;

@SuppressWarnings("ClassCanBeRecord")
@AllArgsConstructor
@Builder
public class Data implements Response {
    public final Message message;
    @JsonProperty("data")
    public final DayLengthModel dayLengthModel;

    public Data(Message aMessage) {
        this.message = aMessage;
        this.dayLengthModel = new DayLengthModel();
    }
}
