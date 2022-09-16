package pl.iskrzynski.dayLength;

import lombok.AllArgsConstructor;
import lombok.Builder;
import pl.iskrzynski.dayLength.dayLength.DayLengthModel;
import pl.iskrzynski.dayLength.user.UserModel;

@SuppressWarnings("ClassCanBeRecord")
@AllArgsConstructor
@Builder
public class Response {
    public final DayLengthModel dayLengthModel;
    public final UserModel user;
}
