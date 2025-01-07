package strings;

import java.util.Scanner;

public class DublicatesWordsInTheString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence by including the dubicates in it : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] words = str.split(" ");
        int count;
        System.out.println("The dublicates words are : ");
        for(int i=0 ; i<words.length; i++){
            count = 1;
            for(int j= i+1; j< words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                }
                words[j] = "0";
            }
            if(count > 1 && words[i] != "0"){
                System.out.println(words[i]);
            }
        }
        sc.close();

    }
}
