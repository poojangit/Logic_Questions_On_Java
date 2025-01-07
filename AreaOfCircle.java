import java.util.Scanner;

public class AreaOfCircle {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius = sc.nextInt();
        double areaOfaCircle = Math.PI*Math.pow(radius, 2);
        double circumferanceOfaCircle = 2*Math.PI*radius;
        System.out.println(areaOfaCircle);
        System.out.println(circumferanceOfaCircle);
        sc.close();
    }
}
