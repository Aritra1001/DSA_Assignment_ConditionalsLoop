package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        float sum = 0, avg = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();
        System.out.println("Enter the marks of " + n + " subjects");
        for( int i = 1; i <= n; i++){
            float marks = in.nextFloat();
            sum = sum + marks;
        }
        avg = sum/n;
        System.out.println("Average marks = " + avg);
    }
}
