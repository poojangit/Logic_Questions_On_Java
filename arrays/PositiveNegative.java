package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> possitive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i=0; i<size; i++){
            if(arr[i]>0){
               possitive.add(arr[i]);
            } 
            else{
                negative.add(arr[i]);
            }
        }
        System.out.println("Possitive: " + possitive);
        System.out.println("Negative: " + negative);
        sc.close();
    }
}
