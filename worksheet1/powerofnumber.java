import java.util.*;
public class powerofnumber {
    public static void main(String[]args){
        int i,x=4,y=2,sum=1;
        for(i=0;i<y;i++)
        {
            sum=sum+x;
        }
        System.out.println("power of"+x+"^"+y);
        System.out.println(Math.pow(x,y));
    }
    
}

