package pl.iskrzynski.dayLength.dayLength;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.iskrzynski.dayLength.Data;
import pl.iskrzynski.dayLength.Response;

import java.util.Map;

@RestController("/")
public class DayLengthController {

    @GetMapping("")
    public String showInstruction() {
        return "example: day.appset.pl/api/?N=50&E=21";
    }

    @GetMapping("api")
    public Response dayLength(@RequestParam Map<String, String> aParams) {
        DayLengthService dayLengthService = new DayLengthService();
        return dayLengthService.requestResponse(aParams);
    }
}
