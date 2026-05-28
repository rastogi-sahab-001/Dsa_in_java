/* Check Leap Year

Conditions:

divisible by 4
not divisible by 100
divisible by 400
*/

package if_else_condition;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year:");
        int n = sc.nextInt();
        if((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
        sc.close();
    }    
}