package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float sum = 0, cgpa = 0;
        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Enter grade in "+ i + "th subject");
            float grade = in.nextFloat();
            sum = sum + grade;
        }
        cgpa = sum / n;
        System.out.println("CGPA = " + cgpa);
    }
}
