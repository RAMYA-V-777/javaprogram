/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worksheet1;

/**
 *
 * @author Desktop Pc
 */
import java.util.*;

public class product {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter amount and discount");
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        double amount=a/100*b;
        System.out.println("Commision amount"+(a-amount));
    }
    
}
