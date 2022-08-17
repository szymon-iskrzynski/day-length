package pl.iskrzynski.dayLength.dayLength;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.iskrzynski.dayLength.Response;

import java.util.Map;

@RestController("/")
public class DayLengthController {

    @GetMapping("")
    public String showInstruction() {

        return "http://day-length.herokuapp.com/api/v1/?E=52?N=21?data=1/1/2000?citi=Warszawa";
    }

    @GetMapping("api/v1")
    public Response dayLength(@RequestParam Map<String, String> aParams) {
        DayLengthService dayLengthService = new DayLengthService();
        return dayLengthService.requestResponse(aParams);
    }
}
