package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("We are calculating depreciation amount using straight-line method");
        System.out.print("Enter cost of asset: ");
        float asset = in.nextFloat();
        System.out.print("Enter salvage value: ");
        float salvage = in.nextFloat();
        System.out.print("Enter useful life of asset in years: ");
        float life = in.nextFloat();
        float depreciation = (asset - salvage) / life;
        System.out.println("Depreciation Value = " + depreciation);
    }
}
