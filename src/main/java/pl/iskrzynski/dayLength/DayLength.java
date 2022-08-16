package pl.iskrzynski.dayLength;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DayLength {


    @GetMapping("")
    public String dayLength(){
        return "24h";
    }
}
