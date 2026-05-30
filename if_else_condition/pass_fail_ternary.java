/*  Question: Check Pass or Fail

Take marks as input.

Condition:

Marks ≥ 33 → Pass
Marks < 33 → Fail
*/

package if_else_condition;

import java.util.*;

public class pass_fail_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks:-");
        double marks = sc.nextDouble();
        String result = (marks >= 33) ? "pass" : "fail";
        System.out.println(result);
        sc.close();
    }
}
