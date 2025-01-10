package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfNonRepeatingSubstring(String str){
        int maxLength = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right < str.length(); right++){
            char currentChar = str.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        System.out.println("The length of a String " + str + " of non-repeating character is " + lengthOfNonRepeatingSubstring(str));
        sc.close();
    }
}
