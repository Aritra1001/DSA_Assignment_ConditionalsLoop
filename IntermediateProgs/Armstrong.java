package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Armstrong Number is a number that is equal to the sum of the cube of its digits
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int dig,num = n, sum = 0;
        while (num != 0){
            dig = num % 10;
            num = num / 10;
            sum = sum + dig * dig * dig;
        }
        if(sum == n){
            System.out.println(n + " is an armstrong number");
        }
        else{
            System.out.println(n + " is not an armstrong number");
        }
    }
}
