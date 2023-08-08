package AssigmentConditionalsLoop;

import java.util.Scanner;

public class VOPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base length, base width and height of the pyramid");
        float l = in.nextFloat();
        float w = in.nextFloat();
        float h = in.nextFloat();
        double vol = (l * w * h)/3;
        System.out.println("Volume of pyramid = "+ vol);
    }
}
