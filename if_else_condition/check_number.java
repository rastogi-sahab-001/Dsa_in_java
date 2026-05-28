// Check four digit number

package if_else_condition;

import java.util.Scanner;

public class check_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int n = sc.nextInt();
        if(n > 999 && n < 10000){
            System.out.println("Four Digit Number");
        }
        else{
            System.out.println("Not a Four Digit Number");
        }

        sc.close();
    }
}
