// Volume of sphere
import java.util.*;
public class volumeofsphere {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Radius :- ");
        double radius = sc.nextDouble();
        double volume = (4.0/3.0) * 3.14 * radius * radius * radius;
        System.out.println("Volume of sphere is"+ " "+ volume); 
        sc.close();
    }
}

