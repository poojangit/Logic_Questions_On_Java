import java.util.Scanner;

public class PositiveOrNegativeCheck {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      if(n>0){
          System.out.println("Its a positive number");
      }
      else if(n<0){
          System.out.println("Its a negative number");
      }
   }
}
