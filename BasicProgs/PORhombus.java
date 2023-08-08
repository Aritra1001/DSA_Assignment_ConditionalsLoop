package AssigmentConditionalsLoop;

import java.util.Scanner;

public class PORhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of side of rhombus: ");
        int a = in.nextInt();
        int peri = 4 * a;
        System.out.println("Perimeter of rhombus = "+ peri);
    }
}
