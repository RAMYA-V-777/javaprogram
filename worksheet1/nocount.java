/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worksheet1;
import java.util.*;

/**
 *
 * @author Desktop Pc
 */
public class nocount {
    public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit");
      int n=obj.nextInt();
      int pos=0,neg=0,zero=0,count;
      for(count=1;count<=n;count++)
      {
          System.out.println();
          int x=obj.nextInt();
          if(x>0)
              pos++;
          else if(x<0)
              neg++;
          else
              zero++;
      }
      System.out.println("no of positive no"+pos);
      System.out.println("no of negative no"+neg);
      System.out.println("no of zerono"+zero);
                              
                  
      }
    }
    

