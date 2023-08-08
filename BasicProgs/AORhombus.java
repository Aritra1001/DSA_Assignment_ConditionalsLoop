package AssigmentConditionalsLoop;

import java.util.Scanner;

public class AORhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the diagonals of the rhombus: ");
        float d1 = in.nextFloat();
        float d2 = in.nextFloat();
        double ar = 0.5 * d1 * d2;
        System.out.println("Area of rhombus = " + ar);
    }
}
