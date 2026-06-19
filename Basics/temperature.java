// Celsius to Fahrenheit
import java.util.*;
public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter celsius:-");
        double celsius = sc.nextDouble();
        double Fahrenheit = ( 9.0 / 5.0 ) * celsius + 32;
        System.out.print(Fahrenheit);

    }
}
