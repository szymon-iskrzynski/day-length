package pl.iskrzynski.dayLength.dayLength;

import lombok.Builder;
import lombok.Getter;

<<<<<<< HEAD:src/main/java/pl/iskrzynski/dayLength/CitiCoordinates.java
public record CitiCoordinates(double latitude, double longitude) {
}
=======

@SuppressWarnings("ClassCanBeRecord")
@AllArgsConstructor
@Getter
@Builder
public class CitiCoordinates {
    private final double latitude;
    private final double longitude;
}
>>>>>>> 32cf4855cd0bdbd46028a7706c98adb3c93963fb:src/main/java/pl/iskrzynski/dayLength/dayLength/CitiCoordinates.java
