package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the MRP of product: ");
        float mrp = in.nextFloat();
        System.out.print("Enter the percentage of discount: ");
        float dis = in.nextFloat();
        double final_price = Math.round(mrp - (mrp * dis)/100) ;
        System.out.println("Final price of the product after discount = " + final_price);
    }
}
