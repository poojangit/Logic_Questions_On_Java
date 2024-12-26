import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter side of square: ");
      int s = sc.nextInt();
      double areaOfSquare = s*s;
      double perimeterOfSquare = 4*s;
      System.out.println(areaOfSquare + " is a are of square");
      System.out.println(perimeterOfSquare + " is a perimeter of square");
        
    }
}
