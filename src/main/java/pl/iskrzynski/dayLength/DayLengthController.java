package pl.iskrzynski.dayLength;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DayLengthController {

    @GetMapping("")
    public String showInstruction(){

        return "http://day-length.herokuapp.com/api/v1/?E=52?N=21";
    }

    @GetMapping("api/v1/")
    public String dayLength(){
        return "24h";
    }
}
