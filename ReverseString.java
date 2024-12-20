import java.util.Scanner;

public class ReverseString {
    public static String reserve(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length()-1; i>=0 ; i-- ){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        System.out.println(str);
        System.out.println(reserve(str));
        sc.close();
    }
}
