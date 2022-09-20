package pl.iskrzynski.dayLength;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import pl.iskrzynski.dayLength.dayLength.DayLengthModel;
import pl.iskrzynski.dayLength.user.UserModel;

@SuppressWarnings("ClassCanBeRecord")
@AllArgsConstructor
@Builder
public class Response {
    public final Message message;
    @JsonProperty("data")
    public final DayLengthModel dayLengthModel;
    public final UserModel user;

    public Response(Message aMessage) {
        this.message = aMessage;
        this.dayLengthModel = new DayLengthModel();
        this.user =new UserModel();
    }
}
