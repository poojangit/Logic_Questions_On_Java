package strings;

import java.util.Scanner;

public class SwapTwoWordWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any stwo strings: ");
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("Before swapping : a : " + str1 + " b : " + str2 );
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swapping : a : " + str1 + " b : " + str2);
        sc.close();
    }
}
