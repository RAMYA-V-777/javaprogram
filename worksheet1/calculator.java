

package worksheet1;

import java.util.*;
public class calculator {
    public static void main(String[] args){
        int x=3,y=4;
       Scanner obj=new Scanner(System.in);
        System.out.println("enter the value of x,y");
        char c=obj.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;   
            case '*': 
                System.out.println(x*y);
                break; 
            case '/': 
                System.out.println(x/y);
                break;
            default:
                System.out.println("syntax error");
        
       }
    }
}
