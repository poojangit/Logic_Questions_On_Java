import java.util.Scanner;

public class CheckUserEnteredZeroOrNonZero {
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
     if(n==0){
         System.out.println("User entered 0");
     }
     else {
         System.out.println("User entered non-zero");
     }
   }
}
