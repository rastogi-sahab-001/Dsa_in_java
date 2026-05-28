// Voting eligibility

package if_else_condition;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not Eligible for Vote");
        }
        sc.close();
    }
}
