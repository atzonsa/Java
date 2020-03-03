
package myfirstproject;

import java.util.Scanner;

public class Array2Dimension {
    public static void main(String []arg)
    {
        int sum=0;
      while (true)
      {
        Scanner s=new Scanner(System.in);
     int a[][]=new int [2][2];
     int b[][]=new int [2][2];
     int c[][]=new int [2][2];
     System.out.println("Enter 4 element of array \"A\"");
     int i,j,k;
     for(i=0;i<2;i++)
     {
         for(j=0;j<2;j++)
             a[i][j]=s.nextInt();
     }
     
     System.out.println("Enter 4 element of array \"B\"");
     for(i=0;i<2;i++)
     {
         for(j=0;j<2;j++)
             b[i][j]=s.nextInt();
     }
     System.out.println("A+B=");
     for(i=0;i<2;i++)
     {
         for(j=0;j<2;j++)
         {
            System.out.print((a[i][j] + b[i][j]) +" ");
         }
         
         System.out.println();
     }
     for(i=0;i<2;i++){
         for(k=0;k<2;k++){
             for(j=0;j<2;j++){
                 sum+=a[i][j]*b[j][k];
             }
             c[i][k]=sum;
             sum=0;
            System.out.print(c[i][k]+ " ");
         }
         System.out.println();
     }
     
     System.out.println(" Addition of Diagonal element: ");
     sum=0;
     for(i=0;i<2;i++)
     { 
         for(j=0;j<2;j++)
         {
             if(i==j)
             sum+=a[i][i];    
         }
     
     }
     System.out.println("SUm="+sum);
      
      }
    }
}
