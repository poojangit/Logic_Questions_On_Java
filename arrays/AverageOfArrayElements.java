package arrays;

import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i= 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i=0; i<size; i++){
            sum = sum + arr[i];
        }
        int averageOfArrayElements = sum/size;
        System.out.println("Sum is " + sum);
        System.out.println("Average of elements is " + averageOfArrayElements);
    }
}
