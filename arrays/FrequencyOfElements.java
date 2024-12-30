package arrays;

import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] visited = new int[size];       
         System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            visited[i] = 0;
        }
        
        System.out.println("Frequency of each elements: ");
        for(int i=0; i<size; i++){
            if(visited[i]==1){
                continue;
            }
            int count = 1;
            for(int j= i+1; j<size;j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = 1;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
        sc.close();
    }
}
