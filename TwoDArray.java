package myfirstproject;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String []arg)
    {
        Scanner s=new Scanner(System.in);
         int ar[][]=new int [2][2];
         System.out.println("ENter 4 element of ar");
         int i,j;
         for(i=0;i<2;i++)
         {
             for(j=0;j<2;j++)
                 ar[i][j]=s.nextInt();
         }

         for(i=0;i<2;i++)
         {
             for(j=0;j<2;j++)
                System.out.print(ar[i][j]+" ");
             System.out.println();
         }
    }
}