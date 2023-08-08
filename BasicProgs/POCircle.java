package AssigmentConditionalsLoop;

import java.util.Scanner;

public class POCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        float r = in.nextFloat();
        double peri = 2 * 3.14 * r;
        System.out.println("Perimeter of the circle = "+ peri);
    }
}
