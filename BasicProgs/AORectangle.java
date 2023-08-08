package AssigmentConditionalsLoop;

import java.util.Scanner;

public class AORectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle :");
        int l = s.nextInt();
        int b = s.nextInt();
        int ar = l * b;
        System.out.println("Area of rectangle = "+ ar);
    }
}
