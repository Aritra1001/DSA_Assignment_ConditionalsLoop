package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the average loads per hour consumed by the user daily: ");
        float load = in.nextFloat();
        System.out.print("Enter the rate per unit: ");
        float u_rate = in.nextFloat();  // 1 unit = 1 KWh
        double u_consumed = (load * 24 * 30)/ 1000;
        System.out.println("Total units consumed per month = "+ u_consumed);
        double e_bill = u_consumed * u_rate;
        System.out.println("Total electricity bill for the month = "+ e_bill);
    }
}
