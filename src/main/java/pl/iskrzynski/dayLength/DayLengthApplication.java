package pl.iskrzynski.dayLength;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class DayLengthApplication {
	@GetMapping("")
	public String dayLength(){
		return "24h";
	}
	public static void main(String[] args) {
		SpringApplication.run(DayLengthApplication.class, args);
	}

}
