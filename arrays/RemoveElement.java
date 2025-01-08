package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static int[] removeEle(int[] arr, int value){
        int j = 0;
        for(int i=0 ; i<arr.length; i++){
            if(value != arr[i]){
                arr[j] = arr[i];
                j++;
            }
        }
        return Arrays.copyOf(arr, j);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value that you need to remove from the element: ");
        int value = sc.nextInt();
        System.out.println("New array after removing the value " + value + " is : ");
        System.out.println(Arrays.toString(removeEle(arr, value)));;
        sc.close();
    }

    
}
