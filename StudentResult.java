import java.util.Scanner;

public class StudentResult {
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter a 4 subjects marks: ");
      int maths = sc.nextInt();
      int pysics = sc.nextInt();
      int chemistry = sc.nextInt();
      int java = sc.nextInt();
      if(maths <= 30 || pysics <=30 || chemistry <= 30 || java <= 30){
          System.out.println("fail");
      } else {
          System.out.println("Pass");
      }
   }
}
