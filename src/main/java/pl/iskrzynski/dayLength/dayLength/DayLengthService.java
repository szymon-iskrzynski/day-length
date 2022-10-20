package pl.iskrzynski.dayLength.dayLength;

import lombok.NoArgsConstructor;
import pl.iskrzynski.dayLength.Data;
import pl.iskrzynski.dayLength.Error;
import pl.iskrzynski.dayLength.Message;
import pl.iskrzynski.dayLength.Response;

import java.time.LocalDate;
import java.util.Map;

@NoArgsConstructor
public class DayLengthService {
    private Map<String,String> params;
    public Response requestResponse(Map<String, String> aParams) {
        if (aParams.containsKey("N") && aParams.containsKey("E") && aParams.size()==2) {

            Double N = Double.parseDouble(aParams.get("N"));
            Double E = Double.parseDouble(aParams.get("E"));
            return Data.builder()
                    .dayLengthModel(CalculateDayLength.calculate(LocalDate.now(),CitiCoordinates.builder().longitude(E).latitude(N).build()))
                    .message(new Message("OK"))
                    .build();
        }
        else {
            return new Error();
        }
    }

}
