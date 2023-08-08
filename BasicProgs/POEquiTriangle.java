package AssigmentConditionalsLoop;

import java.util.Scanner;

public class POEquiTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the equilateral triangle");
        float a = in.nextFloat();
        double peri = 3 * a;
        System.out.println("Perimeter of the equilateral triangle = "+ peri);
    }
}
