package if_else_condition;

import java.util.*;

public class greater_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        int greatest = (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);

        System.out.println("Greatest Number = " + greatest);
        System.out.println(greatest);
        sc.close();
    }
}