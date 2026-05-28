// Positive, Negative or Zero

package if_else_condition;

import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        if(n>0){
            System.out.print("positive Number");
        }else if(n<0){
            System.out.print("negative Number");
        }else{
            System.out.print("Zero");
        }
        sc.close();
    }
}
