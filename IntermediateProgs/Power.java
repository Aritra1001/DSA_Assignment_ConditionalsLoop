package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.print("Enter a exponent: ");
        int exp = in.nextInt();
        double power =  Math.pow(n, exp);
        System.out.println("Power = " + power);
    }
}
