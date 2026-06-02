// Profit, Loss 

package if_else_condition;

import java.util.Scanner;

public class profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Selling Price:");
        double sp = sc.nextDouble();
        System.out.print("Enter Cost Price:");
        double cp = sc.nextDouble();
        if(sp>cp){
            System.out.println("Profit");
        }else if(cp>sp){
            System.out.println("Loss");
        }
        sc.close();
    }    
}
