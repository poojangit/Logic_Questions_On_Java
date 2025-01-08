package arrays;

import java.util.Scanner;

public class SingleNumber {
    public static int returnSingleNum(int[] arr){
        int j=0;
        for(int arrs: arr){
            j ^= arrs;
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0 ; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The single digit present in the arrays is : ");
        System.out.println(returnSingleNum(arr));
        sc.close();
    }
}
