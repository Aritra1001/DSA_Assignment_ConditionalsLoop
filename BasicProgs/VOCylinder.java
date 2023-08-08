package AssigmentConditionalsLoop;

import java.util.Scanner;

public class VOCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius and height of the cylinder: ");
        float r = in.nextFloat();
        float h = in.nextFloat();
        double vol = 3.14 * r * r *h;
        System.out.println("Volume of the cylinder = "+ vol);
    }
}
