package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");  // Calculating average of n numbers
        int n = in.nextInt();
        int i = 1;
        int sum = 0;
        float avg;
        while(i <= n){
            System.out.println("Enter the "+ i + " number");
            int num = in.nextInt();
            sum = sum + num;
            i++;
        }
        System.out.println(sum);
        avg = (float) sum / n;
        System.out.println("Average of "+ n + " numbers = "+ avg);
    }
}
