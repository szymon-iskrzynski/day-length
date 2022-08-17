package pl.iskrzynski.dayLength;

import java.time.LocalTime;

public class DayLengthService {


    public void calculate() {
        final int R = 2022;
        final int M = 8;
        final int D = 17;

        double N = 52;
        double E = 21;

        double C = (367 * R - (int) (7 * (R + (int) ((M + 9) / 12)) / 4) + (int) (275 * M / 9) + D - 730531.5) / 36525;

        System.out.println("C: " + C);

        double a = 628.331969753199 * C;
        a = (4.8949504201433 + a) % 6.28318530718;

        System.out.println("a: " + a);

        double b = 628.3019501 * C;
        b = (6.2400408 + b) % 6.28318530718;

        System.out.println("b: " + b);

        double c = 0.409093 - 0.0002269 * C;

        System.out.println("c :" + c);

        double d = 0.033423 * Math.sin(b) + 0.00034907 * Math.sin(2 * b);

        System.out.println("d :" + d);

        double f = 0.0430398 * Math.sin(2 * (a + d)) - 0.00092502 * Math.sin(4 * (a + d)) - d;

        double g = Math.asin(Math.sin(c) * Math.sin(a + d));

        double rad = Math.PI / 180;

        double h = (Math.sin(rad * (-0.833)) - Math.sin(rad * N) * Math.sin(g)) / (Math.cos(rad * N) * Math.cos(g));

        double T1 = (Math.PI - (f + rad * E + Math.acos(h))) / (15 * rad);

        double T2 = (Math.PI - (f + rad * E - Math.acos(h))) / (15 * rad);

        System.out.println(LocalTime.ofSecondOfDay((int) (3600 * T1)));
        System.out.println(LocalTime.ofSecondOfDay((int) (3600 * T2)));
    }
}
