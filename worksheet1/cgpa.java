import java.io.*;
import java.util.*;
class Cgpa{
  public static void main(String arg[])
  {
Scanner o=new Scanner(System.in);
     
System.out.println("Enter value of n:");

int n=o.nextInt();
 
     double m[]=new double[n];
 
     double g[]=new double[n];
 
     double cgpa,sum=0;
 System.out.println("Enter the subject marks:");
     for(int i=0;i<n;i++)
     {
       m[i]=o.nextInt();
     }
 
     for(int i=0;i<n;i++)
     {
       g[i]=(m[i]/10);
     }
 
     for(int i=0;i<n;i++)
     {
        sum+=g[i];
     }
 
     cgpa=sum/n;
 
     System.out.println("cgpa="+cgpa);
 
     System.out.println("percantage from cgpa="+cgpa*9.5);
 
   }
}