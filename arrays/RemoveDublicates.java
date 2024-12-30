package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int result[] = new int[size];
        int j=0;
        for(int i=0; i<size;i++){
            if(i==0 || arr[i] != arr[i-1]){
               result[j] = arr[i];
               j++; 
            }
        }
        System.out.println("Array after removing dublicates: ");
        for(int i=0 ; i<j; i++){
            System.out.println(result[i]);
        }
        sc.close();
    }
}
