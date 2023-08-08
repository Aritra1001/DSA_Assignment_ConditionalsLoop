package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        int runs = s.nextInt();
        System.out.print("Enter number of times the batsman got out: ");
        int out = s.nextInt();
        float batAvg = (float) runs / out;
        System.out.println("Batting average = " + batAvg);
    }
}
