package myfirstproject;

import java.util.Scanner;

public class FabournicSeries {
    public static void main(String[]arg){
        while (true)
        {
            Scanner s=new Scanner(System.in);
            int sum=0;
            int firstVal, secondVal, numberofTimes;
            System.out.println("Please enter the first value");
            firstVal = s.nextInt();
            System.out.println("Please enter the second value");
            secondVal = s.nextInt();
            System.out.println("Number of times?");
            numberofTimes = s.nextInt();
        
            System.out.println("Processing....");
            
            for(int i=1;i<=numberofTimes;i++)
            {
                sum = firstVal + secondVal;
                System.out.println(sum);
                firstVal = secondVal;
                secondVal = sum;
            }
        }
    }    
}