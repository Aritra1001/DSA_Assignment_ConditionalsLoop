package AssigmentConditionalsLoop;

import java.util.Scanner;

public class TSACube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of side of cube: ");
        float a = in.nextFloat();
        double sa = 6 * a * a;
        System.out.println("Total Surface Area of cube = "+ sa);
    }
}
