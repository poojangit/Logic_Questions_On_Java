
import java.util.Scanner;

public class Fibonacci {
    public static void printFibonacci(int n) {
        int a = 0, b= 1;
        // System.out.println(a + " " + b);
        for(int i = 1; i< n; i++){
            int next = a+b;
            System.out.println(" " + next);
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int num = sc.nextInt();
        printFibonacci(num);
        sc.close();
    }
}
