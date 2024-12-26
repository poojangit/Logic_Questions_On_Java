import java.util.Scanner;

public class SmallestAmoungTwo {
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter any two number: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int smallest = (a<b)? a: b;
      System.out.println(smallest);
   }
}
