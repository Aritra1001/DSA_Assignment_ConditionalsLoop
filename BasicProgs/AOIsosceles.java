package AssigmentConditionalsLoop;

import java.util.Scanner;

public class AOIsosceles {
    public static void main(String[] args) {
        //We will find the area of isosceles triangle using all 3 sides.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of equal sides and base of the triangle :");
        int a = in.nextInt();
        int b = in.nextInt();
        double ar =  0.5 * (Math.sqrt(a*a - (double) (b * b) /4) * b);
        System.out.println("Area of the isosceles triangle = "+ ar);
    }
}
