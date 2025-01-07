package strings;

import java.util.Scanner;

public class UpperCaseToLowerWithoutBuiltin {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string : ");
    String str = sc.nextLine();
    for(int i=0; i<str.length(); i++){
        char character = str.charAt(i);
        if(65<= character && character <= 90){
            character = (char)(character+ 32);
        }
        System.out.print(character);
    }
    sc.close();
}
    
}