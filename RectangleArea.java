import java.util.Scanner;

public class RectangleArea {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter length: ");
       int length = sc.nextInt();
       System.out.println("Enter breadth: ");
       int breadth = sc.nextInt();
       double areaOfRectangle = length*breadth;
       double perimeterOfRectangle = 2*(length+breadth);
       System.out.println(areaOfRectangle);
       System.out.println(perimeterOfRectangle);   
    }
}
