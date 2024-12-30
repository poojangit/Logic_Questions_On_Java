package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDublicatesUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0 ; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++){
            map.put(arr[i],1);
        }
        System.out.println("Array after removing dublicates: ");
        for(int key: map.keySet()){
            System.out.println(key + " ");
        }
        sc.close();
    }
}
