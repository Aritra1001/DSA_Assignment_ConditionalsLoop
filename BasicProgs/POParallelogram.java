package AssigmentConditionalsLoop;

import java.util.Scanner;

public class POParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and side of the parallelogram");
        float b = in.nextFloat();
        float s = in.nextFloat();
        double peri = 2 * (b + s);
        System.out.println("Perimeter of the parallelogram = "+ peri );
    }
}
