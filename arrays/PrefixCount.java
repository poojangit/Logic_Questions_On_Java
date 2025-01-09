package arrays;

import java.util.Scanner;

public class PrefixCount {
    public static int countThePrefix(String[] word , String pref ){
        int count = 0;
        for(String words : word){
            if(words.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:  ");
        int size = sc.nextInt();
        String[] word = new String[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i< size; i++){
            word[i] = sc.next();
        }
        System.out.println("Enter the pref : ");
        String pref = sc.next();
        System.out.println("The count of a prefix " + pref + " in a String array is " + countThePrefix(word, pref));
        sc.close();
    }
}
