// Quadrant 

package if_else_condition;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println("1st Quadrant");
        }
        else if(x < 0 && y > 0){
            System.out.println("2nd Quadrant");
        }
        else if(x < 0 && y < 0){
            System.out.println("3rd Quadrant");
        }
        else if(x > 0 && y < 0){
            System.out.println("4th Quadrant");
        }
        else if(x == 0 && y == 0){
            System.out.println("Origin");
        }
        else if(x == 0){
            System.out.println("On Y-Axis");
        }
        else{
            System.out.println("On X-Axis");
        }

        sc.close();
    }
}
