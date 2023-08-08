package AssigmentConditionalsLoop;

import java.util.Scanner;

public class AOParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and height of parallelogram: ");
        float b = in.nextFloat();
        float h = in.nextFloat();
        double ar = b * h;
        System.out.println("Area of parallelogram = "+ ar);
    }
}
