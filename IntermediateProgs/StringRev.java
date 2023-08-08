package AssigmentConditionalsLoop.IntermediateProgs;

import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string to be reversed: ");
        String s = in.next().toLowerCase();
//        String revStr = "";
        StringBuilder revStr = new StringBuilder();
        char ch;
        for(int i = s.length()-1; i >= 0; i--){
           ch = s.charAt(i);
//            revStr += ch;
            // Instead of this we can also write revStr.append(ch)
            revStr.append(ch);
        }
        System.out.println("Original String = " + s);
        System.out.println("Reversed String = " + revStr);
    }
}
