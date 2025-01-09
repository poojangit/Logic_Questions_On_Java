package strings;

import java.util.Scanner;

public class lengthOfaString {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine();
    int length = 0;
    for(@SuppressWarnings("unused") char c : str.toCharArray()){
        length++;
    }
    System.out.println("Length is " + length);
    sc.close();
}
}
