//ASCII Value to Char Value
import java.util.*;

public class ASCIINumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value :-");
        int n = sc.nextInt();
        char ch = (char) n;
        System.out.println("ASCII Value is " + ch);
        sc.close();
    }
}
