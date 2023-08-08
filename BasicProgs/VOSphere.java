package AssigmentConditionalsLoop;

import java.util.Scanner;

public class VOSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of sphere");
        float r = in.nextFloat();
        double vol = (4 * 3.14 * r * r * r)/3;
        System.out.println("Volume of sphere = "+vol);
    }
}
