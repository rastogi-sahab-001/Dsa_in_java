// Area of Circle

import java.util.*;
public class Areaofcircle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Radius :- ");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is"+ " "+ area); 
        sc.close();
    }
}
