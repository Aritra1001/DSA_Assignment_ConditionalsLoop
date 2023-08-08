package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float p = in.nextFloat();
        System.out.print("Enter the annual rate in decimal: ");
        float r = in.nextFloat();
        System.out.print("Enter the time in years: ");
        float t = in.nextFloat();
        System.out.print("Enter the number of compounding periods: ");
        float n = in.nextFloat();
        double amt = p * (Math.pow((1 + r/n), (n*t)));
        double interest = amt - p;
        System.out.println("Compound Interest for the entered data = " + interest);
    }
}
