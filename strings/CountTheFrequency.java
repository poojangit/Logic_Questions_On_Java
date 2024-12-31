package strings;

import java.util.Scanner;

public class CountTheFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        // int[] frequency = new int[26];
        int[] frequency = new int[256];
        for(int i=0; i<str.length(); i++){
            // char currentChar = str.charAt(i);
            // if(currentChar>= 'a' && currentChar<= 'z'){
            //     frequency[currentChar - 'a'] ++;
            // }
            frequency[str.charAt(i)]++;
        }
        System.out.println("Character frequencies: ");
        for(int i=0; i<256; i++){
            if (frequency[i] > 0) {
                // char character = (char) (i+'a');
                // System.out.println(character + " : " + frequency[i]);
                System.out.println((char)i + " : " + frequency[i]);
            }
        } sc.close();
    }
}
