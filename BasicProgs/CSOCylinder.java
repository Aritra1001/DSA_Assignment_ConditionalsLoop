package AssigmentConditionalsLoop;

import java.util.Scanner;

public class CSOCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius and height of cylinder");
        float r = in.nextFloat();
        float h = in.nextFloat();
        double ar = 3.14 * r * h;
        System.out.println("Curved surface area of cylinder = " + ar);
    }
}
