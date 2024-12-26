import java.util.Scanner;

public class SmallestAmoungThree {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter any 3 integer value: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int small = a;
      if(b<small){
          small = b;
      }
      if(c < small){
          small = c;
      }
      System.out.println("Biggest amoung the 3 is " + small);
   }
}
