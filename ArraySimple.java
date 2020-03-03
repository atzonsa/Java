package myfirstproject;
import java.util.Scanner;
public class ArraySimple {
    public static void main(String[] arg)
    {
        while (true)
        {
            int a[] = {1, 2, 3, 4, 5};
            int i=0;
            for(i=0;i<5;i++)
            {
                System.out.println(a[i]+" ");
            }
            
            Scanner s=new Scanner(System.in);
            System.out.println("Please enter 5 values for array");
            for(i=0;i<5;i++)
            {
                a[i] = s.nextInt();
            }
            
            System.out.println("The sum of all array values is: " + (a[0]+a[1]+a[2]+a[3]+a[4]));
            int maxValue=0;
            
            for(i=0;i<4;i++)
            {
                if (a[i] <= a[i+1])
                {
                    maxValue = a[i+1];
                }
                else
                {
                   maxValue = a[i]; 
                } 
            }
                        
            System.out.println("The max value in array is: " + maxValue);
            
            System.out.println("Please enter the index to get value");
            System.out.println(a[s.nextInt()]); 
            
            System.out.println("Please enter the value to get index");
            int value = s.nextInt();
             for(i=0;i<5;i++)
            {
                if (a[i] == value)
                     System.out.println(i);
            }
        }
    }   
}