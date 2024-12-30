package arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        // System.out.println(arr);
        System.out.println("Enter array elements: ");
        for(int i=0; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed array: ");
        for(int i = arr.length-1 ; i>=0 ; i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
