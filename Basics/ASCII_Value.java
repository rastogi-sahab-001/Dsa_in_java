// Char Value to ASCII Value

import java.util.*;
public class ASCII_Value {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value :-");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println("ASCII Value is "+ ascii); 
        sc.close();
    }
}
