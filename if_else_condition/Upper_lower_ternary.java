package if_else_condition;

import java.util.Scanner;

public class Upper_lower_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character:-");
        char ch = sc.next().charAt(0);
        String result = (ch >= 'A' && ch <= 'Z')
                ? "Uppercase"
                : "Lowercase";
        System.out.println(result);
        sc.close();
    }
}
