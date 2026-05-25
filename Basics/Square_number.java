import java.util.*;

public class Square_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int square = n * n;

        System.out.println(square + " is the square of " + n);

        sc.close();
    }
}