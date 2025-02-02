package arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i=1; i<n ; i++){
            if (arr[i]> largest) {
                largest = arr[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }
       
        System.out.println("First largest - "+ largest);
        System.out.println("Second largest - " + secondLargest);
        sc.close();
    }
}
