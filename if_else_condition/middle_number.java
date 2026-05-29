// Middle Number

package if_else_condition;

import java.util.Scanner;

public class middle_number {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:-");
        int a = sc.nextInt();
        System.out.print("Enter second number:-");
        int b = sc.nextInt();
        System.out.print("Enter third number:-");
        int c = sc.nextInt();
        if(a>b && a<c || a<b && a>c){
            System.out.println(a+" "+"is middle");
        }else if(b>a && b<c || b<a && b>c){
            System.out.println(b+" "+"is middle");
        }else if(c>a && c<b || c<a && c>b){
            System.out.println(c+" "+"is middle");
        }else{
            System.out.println("a, b or c are equal");
        }
        sc.close();
    }
}