// convert double to int

import java.util.Scanner;
public class Explicit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value:-");
        double x = sc.nextDouble();
        int y = (int)x;
        System.out.println(y);
        sc.close();
    }
}
