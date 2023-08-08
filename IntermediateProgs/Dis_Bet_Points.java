package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class Dis_Bet_Points {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the x co-ordinate of point 1: ");
        int x1 = s.nextInt();
        System.out.print("Enter the y co-ordinate of point 1: ");
        int y1 = s.nextInt();
        System.out.print("Enter the x co-ordinate of point 2: ");
        int x2 = s.nextInt();
        System.out.print("Enter the y co-ordinate of point 2: ");
        int y2 = s.nextInt();
        double dis = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
        System.out.println("Distance between two points = " + dis);
    }
}
