package AssigmentConditionalsLoop;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = in.nextInt();
        System.out.println("Enter second number");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum of two numbers = " + sum);
    }
}
