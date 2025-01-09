package strings;

import java.util.Scanner;

class PalindromeCheck {
    public static boolean isPalindrome(String str1){
        int start = 0;
        int end = str1.length()-1;
        while (start<end) {
            if(str1.charAt(start) == str1.charAt(end)){
                return true;
            }
            start ++;
            end --;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1 = sc.next();
        if(isPalindrome(str1)){
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
        sc.close();
    }

}