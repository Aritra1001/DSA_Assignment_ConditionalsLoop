package AssigmentConditionalsLoop;

import java.util.Scanner;

public class AOCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of cirlce: ");
        float r = s.nextFloat();
        double ar = 3.14 * r * r;
        System.out.println("Area of the circle = "+ ar);
    }
}
