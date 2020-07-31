
import java.util.*;

    public class largeno {
    public static void main(String[]args){
        
       Scanner obj=new Scanner(System.in);
       System.out.println("enter three value");
       int a=obj.nextInt();
       int b=obj.nextInt();
       int c=obj.nextInt();
       if(a>b&&a>c)
           System.out.println("A is greater");
       else if(b>a&&b>c)
           System.out.println("B is greater");
       else
           System.out.println("C is greater");
    }
}

