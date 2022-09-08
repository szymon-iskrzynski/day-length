package pl.iskrzynski.dayLength;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculateDayLengthTest {

    CitiCoordinates citiCoordinates = CitiCoordinates.builder().longitude(21.0).latitude(50.0).build();
    LocalDate localDate = LocalDate.of(2000,1,1);
    DayLengthModel expectedDayLength = new DayLengthModel(LocalTime.of(6,34,36),LocalTime.of(14,43,31));

    @Test
    void shouldReturnExpectedDayLengthModel() {
        DayLengthModel dayLengthModel = CalculateDayLength.calculate(localDate,citiCoordinates);
        assertThat(dayLengthModel).isEqualTo(expectedDayLength);
    }
}