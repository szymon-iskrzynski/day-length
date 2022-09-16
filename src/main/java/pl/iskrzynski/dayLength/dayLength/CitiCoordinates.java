package pl.iskrzynski.dayLength.dayLength;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@AllArgsConstructor
@Getter
@Builder
public class CitiCoordinates {
    private final double latitude;
    private final double longitude;
}
