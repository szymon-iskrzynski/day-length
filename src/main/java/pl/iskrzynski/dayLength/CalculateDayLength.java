package pl.iskrzynski.dayLength;

import java.time.LocalDate;
import java.time.LocalTime;

public class CalculateDayLength {

    public static DayLengthModel calculate(LocalDate localDate, CitiCoordinates aCitiCoordinates) {
        final int year = localDate.getYear();
        final int month = localDate.getMonthValue();
        final int day = localDate.getDayOfMonth();

        double N = aCitiCoordinates.latitude();
        double E = aCitiCoordinates.longitude();

        double C = (367 * year - (int) (7 * (year + (int) ((month + 9) / 12)) / 4) + (int) (275 * month / 9) + day - 730531.5) / 36525;

        double a = 628.331969753199 * C;
        a = (4.8949504201433 + a) % 6.28318530718;

        double b = 628.3019501 * C;
        b = (6.2400408 + b) % 6.28318530718;

        double c = 0.409093 - 0.0002269 * C;

        double d = 0.033423 * Math.sin(b) + 0.00034907 * Math.sin(2 * b);

        double f = 0.0430398 * Math.sin(2 * (a + d)) - 0.00092502 * Math.sin(4 * (a + d)) - d;

        double g = Math.asin(Math.sin(c) * Math.sin(a + d));

        double rad = Math.PI / 180;

        double h = (Math.sin(rad * (-0.833)) - Math.sin(rad * N) * Math.sin(g)) / (Math.cos(rad * N) * Math.cos(g));

        double T1 = (Math.PI - (f + rad * E + Math.acos(h))) / (15 * rad);

        double T2 = (Math.PI - (f + rad * E - Math.acos(h))) / (15 * rad);

        return new DayLengthModel(LocalTime.ofSecondOfDay((int) (3600 * T1)),LocalTime.ofSecondOfDay((int) (3600 * T2)));
    }

}
