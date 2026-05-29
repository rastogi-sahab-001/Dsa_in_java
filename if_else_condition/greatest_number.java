// Greatest Number

package if_else_condition;

import java.util.Scanner;

public class greatest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:-");
        int a = sc.nextInt();
        System.out.print("Enter second number:-");
        int b = sc.nextInt();
        System.out.print("Enter third number:-");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater than b and c");
        }else if(b>a && b>c){
            System.out.println("b is greater than a and c");
        }else if(c>a && c>b){
            System.out.println("c is greater than a and b");
        }else{
            System.out.println("a, b or c are equal");
        }
        sc.close();
    }
}
