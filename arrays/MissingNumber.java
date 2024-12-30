package arrays;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size --> n-1");
        int n = sc.nextInt() + 1;
        int[] arr = new int[n-1];
        System.out.println("Enter the array elements: ");
        int sum = 0;
        for(int i = 0; i<n-1; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int totalSum = n*(n+1)/2;
        int missingNum = totalSum - sum;
        System.out.println("Missing number is ------->"+ missingNum);
        sc.close();
    }
}
