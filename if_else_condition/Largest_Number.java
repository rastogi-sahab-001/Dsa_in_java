package if_else_condition;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int n = sc.nextInt();
        System.out.print("Enter Second Number:");
        int x = sc.nextInt();
        if(n>x){
            System.out.println("n is greater than x");
        }else if(x>n){
            System.out.println("x is greater than n");
        }else{
            System.out.println("n is equal to x");
        }
        sc.close();
    }
}
