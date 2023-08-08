package AssigmentConditionalsLoop;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while(true){
            System.out.println("enter a number");
            int num = in.nextInt();

            if(num == 0){
                break;
            }
            else if(num > max){
                max = num;
            }
            System.out.println("largest of all = "+ max);
      }
    }
}
