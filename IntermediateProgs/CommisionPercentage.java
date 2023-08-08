package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class CommisionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of transaction: ");
        double amt = in.nextDouble();
        System.out.print("Enter commission received: ");
        double comm = in.nextDouble();
        double commPer = (comm/amt) * 100;
        System.out.println("Commission Percentage = " + commPer);
    }
}
