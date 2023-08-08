package AssigmentConditionalsLoop;

import java.util.Scanner;

public class VOCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius and height of cone");
        float r = in.nextFloat();
        float h = in.nextFloat();
        double vol =  (3.14 * r * r * h) / 3;
        System.out.println("VOlume of cone = " + vol);
    }
}
