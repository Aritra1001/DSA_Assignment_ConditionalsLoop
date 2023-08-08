package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = in.nextInt();
        int dig, num = n, revNum = 0;
        while (num != 0){
            dig = num % 10;
            num = num / 10;
            revNum = revNum * 10 + dig;
        }
        System.out.println("Reversed Number = " + revNum);
        if(revNum == n){
            System.out.println("The number is palindrome number");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
}
