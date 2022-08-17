package pl.iskrzynski.dayLength.dayLength;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;


@SuppressWarnings("ClassCanBeRecord")
@AllArgsConstructor
@Getter
@Builder
public class CitiCoordinates {
    private final double latitude;
    private final double longitude;

}
