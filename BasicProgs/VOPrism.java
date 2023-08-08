package AssigmentConditionalsLoop;

import java.util.Scanner;

public class VOPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length, height and base of the prism");
        float l = in.nextFloat();
        float h = in.nextFloat();
        float b = in.nextFloat();
        double vol = 0.5 * l * h * b;
        System.out.println("Volume of the prism = "+ vol);
    }
}
