package AssigmentConditionalsLoop;

import java.util.Scanner;

public class Ques24 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.print("Enter a number ");
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            else{
                sum = sum + num;
            }
            System.out.println("Sum of all the numbers = "+ sum);
        }
    }
}
