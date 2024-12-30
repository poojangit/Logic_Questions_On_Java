package arrays;

import java.util.Scanner;

public class AdditionOfTwoMatrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] matrix1 = new int[rows][col];
        int[][] matrix2 = new int[rows][col];
        int[][] sumOfMatrix = new int[rows][col];

        System.out.println("Enter the elements of first matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements for second matrix");
        for(int i=0; i<rows ; i++){
            for(int j=0 ; j<col; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<rows; i++){
            for(int j =0; j<col; j++){
                sumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Addition of two matrix--");
        for(int i=0; i<rows ; i++){
            for(int j=0; j<col ; j++){
                System.out.println(sumOfMatrix[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
