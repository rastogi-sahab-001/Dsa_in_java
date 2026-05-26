// Reverse 2-Digit Number

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2-Digit Number: ");

        int num = sc.nextInt();

        int lastDigit = num % 10;

        int firstDigit = num / 10;

        int reverse = (lastDigit * 10) + firstDigit;

        System.out.println("Reverse Number is: " + reverse);
        sc.close();
    }
}
