package pl.iskrzynski.dayLength.dayLength;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.iskrzynski.dayLength.Response;
import pl.iskrzynski.dayLength.dayLength.CalculateDayLength;
import pl.iskrzynski.dayLength.dayLength.CitiCoordinates;

import java.time.LocalDate;
import java.util.Map;

@NoArgsConstructor
public class DayLengthService {
    private Map<String,String> params;
    public Response requestResponse(Map<String, String> aParams) {
        Double E = Double.parseDouble(aParams.get("E"));
        Double S = Double.parseDouble(aParams.get("S"));
        return Response.builder().dayLengthModel(CalculateDayLength.calculate(LocalDate.now(),
                CitiCoordinates.builder().longitude(S).latitude(E).build())).build();
    }

}
