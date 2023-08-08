package AssigmentConditionalsLoop;

import java.util.Scanner;

public class DigOfInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a multi-digit integer");
        int num = in.nextInt();
        int dig, sum = 0, prod = 1, diff;
        while(num != 0){
            dig = num % 10;
            num = num / 10;
            sum = sum + dig;
            prod = prod * dig;
        }
        diff = prod - sum;
        System.out.println("Sum of the digits of integer = "+ sum);
        System.out.println("Product of the digits of integer = "+ prod);
        System.out.println("Difference between product and sum of the digits of an integer = "+ diff );
    }
}
