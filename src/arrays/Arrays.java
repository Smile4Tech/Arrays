
package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//       double [] numbers=new double[10];
//       double sum=0;
//       int count=0;
//       
//       Scanner input=new Scanner(System.in);
//       
//       for(int i=0;i<10;i++)
//       {
//          System.out.println("Enter number : ");
//          numbers[i]=input.nextDouble();
//          sum+=numbers[i];
//       }
//       
//       double avg=sum/10;
//       for(int i=0;i<10;i++)
//       {
//          if(numbers[i]>avg)
//          {
//              count++;
//          }
//       }
//       
//       System.out.println("Avg is "+avg);
//       System.out.println("nums > Avg is "+count);
//       
//       int []age={2,3,1,5};//age size =4//1
//       int[]age1=new int[]{2,3,1,5};//2
//       // 3
//       int[]x;
//       x=new int[]{4,6,7,8,9};
//       System.out.println(age[2]);
//       //age[2]=8;
//       System.out.println(age[2]);
//       age[2]=age[1]+age[3];
//       System.out.println(age[2]);
//       
//       
//       // 1
//       for(int i=0;i<age.length;i++)
//       {
//           System.out.print(age[i]);
//       }
//       // 2
//       for(int i:age)
//       {
//           System.out.print(i);
//       }
//       System.out.println(age==age1);
//       //age=age1;
       
        // equal 
       
        int []age={2,3,1,5};//age size =4//1
       int[]age1=new int[]{2,8,1,5};//2
       boolean r=true;
       for(int i=0;i<age.length;i++)
       {
           if(age[i]!=age1[i])
           {
               r=false;
           }
       }
       System.out.println("equal ? "+r);
       
       
       
       
       

   
    
       
       
       
       
       
    }
    
}
