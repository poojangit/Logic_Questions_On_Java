package arrays;

import java.util.Scanner;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int posIndex = 0;
        int negIndex = 0;
        int j = 0;
        int[] result = new int[size];
        while (j<size) {
            while (posIndex < size && arr[posIndex] <= 0) {
                posIndex++;
            }
            if(posIndex < size){
                result[j++] = arr[posIndex++];
            }
            while (negIndex < size && arr[negIndex] >= 0) {
                negIndex++;
            }
            if(negIndex < size){
                result[j++] = arr[negIndex++];
            }
        }
        System.out.print("Output : [");
        for(int i=0; i<size ; i++){
            System.out.print(result[i]);
           if(i<size-1){
            System.out.print(",");
           }
        }
        System.out.println("]");
        sc.close();
    }
}
