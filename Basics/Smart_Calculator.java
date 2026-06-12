/*Question: Smart Calculator in Java 💻

Ek Java program banao jo user se 2 numbers input le aur yeh sab operations kare:

Requirements:
Sum
Subtraction
Multiplication
Division
Modulus
Average
Check:
Number even/odd hai ya nahi
Greater number konsa hai
Dono equal hain ya nahi (boolean)
Increment aur decrement operator use karo
Typecasting use karo
Ek BODMAS expression solve karo*/


import java.util.*;

public class Smart_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n = sc.nextInt();

        System.out.print("Enter second number: ");
        int x = sc.nextInt();

        // Arithmetic Operations
        System.out.println("Sum: " + (n + x));
        System.out.println("Subtraction: " + (n - x));
        System.out.println("Multiplication: " + (n * x));

        double div = (double) n / x;
        System.out.println("Division: " + div);

        System.out.println("Modulus: " + (n % x));

        double avg = (n + x) / 2.0;
       

        // Even or Odd
        if (n % 2 == 0) {
            System.out.println("First number is Even");
        } else {
            System.out.println("First number is Odd");
        }

        if (x % 2 == 0) {
            System.out.println("Second number is Even");
        } else {
            System.out.println("Second number is Odd");
        }

        // Greater Number
        if (n > x) {
            System.out.println(n + " is greater than " + x);
        } else if (x > n) {
            System.out.println(x + " is greater than " + n);
        } else {
            System.out.println("Both numbers are equal");
        }

        // Boolean
        boolean equal = (n == x);
        System.out.println("Are both equal? " + equal);

        // Increment
        n++;
        System.out.println("After Increment First Number = " + n);

        // Decrement
        x--;
        System.out.println("After Decrement Second Number = " + x);

        // Typecasting
        int intDivision = (int) div;
        System.out.println("Integer Division using Typecasting = " + intDivision);

        // BODMAS
        int result = 10 + 5 * 3 - 4 / 2;
        System.out.println("BODMAS Result = " + result);

        sc.close();
    }
}