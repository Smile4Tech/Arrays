
package arrays;

import java.util.Scanner;

public class Arrays {

   
    public static void main(String[] args) {
       double [] numbers=new double[10];
       double sum=0;
       int count=0;
       
       Scanner input=new Scanner(System.in);
       
       for(int i=0;i<10;i++)
       {
          System.out.println("Enter number : ");
          numbers[i]=input.nextDouble();
          sum+=numbers[i];
       }
       
       double avg=sum/10;
       for(int i=0;i<10;i++)
       {
          if(numbers[i]>avg)
          {
              count++;
          }
       }
       
       System.out.println("Avg is "+avg);
       System.out.println("nums > Avg is "+count);
       
       
       
       
       
       
       
    }
    
}
