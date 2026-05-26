// Sum of two Numbers
import java.util.*;
public class Sumofnumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :-");
        double a = sc.nextDouble();
          System.out.print("Enter Second Number :-");
        double b = sc.nextDouble();
        double sum = a + b;
        System.out.println("Sum of two number is " + sum);
        sc.close();
    }
}