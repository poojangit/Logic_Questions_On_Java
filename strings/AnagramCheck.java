package strings;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string : ");
        String str2 = sc.nextLine();
        sc.close();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] freq = new int[256];

        if(str1.length() != str2.length()){
            System.out.println("Not a anagram");
            return;
        }
        for(int i=0; i<str1.length(); i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        boolean isAnagram = true;
        for(int i=0; i<256; i++){
            if(freq[i]!=0){
                isAnagram = false;
                break;
            }
        }
     if (isAnagram) {
        System.out.println("Is anagram");
     }
     else{
        System.out.println("Not a anagram");
     }
        sc.close();
    }
}
