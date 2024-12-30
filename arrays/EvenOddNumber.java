package arrays;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
           arr[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0; i<size;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Odd count: " + oddCount);
        System.out.println("Even count: " + evenCount);
        sc.close();
    }
}
