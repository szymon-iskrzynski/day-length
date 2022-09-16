package pl.iskrzynski.dayLength.dayLength;

import pl.iskrzynski.dayLength.Response;
import pl.iskrzynski.dayLength.dayLength.CalculateDayLength;
import pl.iskrzynski.dayLength.dayLength.CitiCoordinates;

import java.time.LocalDate;
import java.util.Map;

public class DayLengthService {

    public Response requestResponse(Map<String, String> aParams) {
        return Response.builder().dayLengthModel(CalculateDayLength.calculate(LocalDate.of(2000, 1, 1), CitiCoordinates.builder().longitude(50).latitude(21).build())).build();
    }

}
