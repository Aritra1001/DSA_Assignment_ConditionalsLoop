package AssigmentConditionalsLoop;

import java.util.Scanner;

public class PORectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle ");
        int l = in.nextInt();
        int b =in.nextInt();
        int peri = 2 * (l + b);
        System.out.println("Perimeter of rectangle = "+ peri);
    }
}
