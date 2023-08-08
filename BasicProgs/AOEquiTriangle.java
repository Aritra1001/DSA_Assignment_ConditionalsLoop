package AssigmentConditionalsLoop;

import java.util.Scanner;

public class AOEquiTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the side of equilateral triangle: ");
        float a = in.nextFloat();
        double ar = Math.sqrt(3)/4 * a * a;
        System.out.println("Area of equilateral triangle = "+ ar);
    }
}
