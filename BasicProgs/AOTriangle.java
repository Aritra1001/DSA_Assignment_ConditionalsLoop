package AssigmentConditionalsLoop;

import java.util.Scanner;

public class AOTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter height and base of the triangle: ");
        float h = s.nextFloat();
        float b = s.nextFloat();
        double ar = 0.5 * b * h;
        System.out.println("Area of the triangle = "+ ar);
    }
}
