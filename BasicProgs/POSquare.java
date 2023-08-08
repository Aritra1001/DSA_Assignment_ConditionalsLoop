package AssigmentConditionalsLoop;

import java.util.Scanner;

public class POSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of side of square:");
        int a = in.nextInt();
        int peri = 4 * a;
        System.out.println("Perimeter of square = "+ peri);
    }
}
