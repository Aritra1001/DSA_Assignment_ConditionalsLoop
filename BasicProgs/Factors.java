package AssigmentConditionalsLoop;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find the factors");
        int num = in.nextInt();
        System.out.print("Factors of "+ num + ": ");
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
