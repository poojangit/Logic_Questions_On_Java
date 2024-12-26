import java.util.Scanner;

public class BiggestAmoungThree {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter any 3 integer value: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int big = a;
      if(b>big){
          big = b;
      }
      if(c > big){
          big = c;
      }
      System.out.println("Biggest amoung the 3 is " + big);
   }
}
