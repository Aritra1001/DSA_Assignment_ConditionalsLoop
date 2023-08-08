package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class Per_Com {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ncr, npr;
        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        System.out.print("Enter value of r: ");
        int r = in.nextInt();
        ncr = fact(n) / (fact(r) * fact(n-r));
        npr = fact(n) / fact(n-r);
        System.out.println("nCr = " + ncr);
        System.out.println("nPr = " + npr);
    }
    public static int fact (int num){
        int factorial = 1;
        for( int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
