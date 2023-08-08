package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Sum of n numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int i = 1;
        float sum = 0;
        System.out.println("Enter " + n + " numbers to find the sum");
        while( i <= n){
           float num = in.nextFloat();
           sum = sum + num;
           i++;
        }
        System.out.printf("Sum of the numbers %f", sum);
    }
}
