// Last Digit of Number using %
import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int num = sc.nextInt();

        int lastDigit = num % 10;

        System.out.println("Last Digit is: " + lastDigit);
        sc.close();
    }
}
