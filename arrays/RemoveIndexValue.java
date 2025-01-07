package arrays;

import java.util.Scanner;

public class RemoveIndexValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index value you need to remove: ");
        int index = sc.nextInt();
        int[] newArr = new int[size-1];
        int j=0;
        if(index < 0 || index >= size){
            System.out.println("Please enter the valid index");
        }
        else {
            for(int i=0; i<size; i++){
                if(i != index){
                    newArr[j++] = arr[i];
                }
            }
            System.out.println("Array after removing the index value " + index + " is : ");
            for(int i=0; i< newArr.length; i++){
                System.out.println(newArr[i]+ " ");
            }
            sc.close();
        }
       
    }
}
