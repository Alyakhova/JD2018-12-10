package by.it.dziomin.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }

    public static void step1() {
        double x = 0.3;
        double a = 756.13;

        double z = cos(pow((pow(x, 2) + PI / 6), 5));
        z = z - sqrt(x * pow(a, 3));
        z = z - log(abs((a - 1.12 * x) / 4));
        System.out.println("z: " + z);
    }

    public static void step2() {
        double a = 1.21;
        double b = 0.371;
        double y = tan(pow(a + b, 2)) - cbrt(a + 1.5) + a * pow(b, 5) - b / log(pow(a, 2));
        System.out.println("y: " + y);

    }

    public static void step3() {
        double a;
        double x = 12.1;
        double f;
        for (a = -5; a <= 12; a = a + 3.75) {
            f = pow(E, a * x) - 3.45 * a;

            System.out.println("a=" + a + "  f=" + f);
        }
    }
}
