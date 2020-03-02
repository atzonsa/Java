package myfirstproject;
import java.util.Scanner;

public class FactorialUptoNNumber {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        while (true)
        {
            System.out.println("Please enter the \"N\" number");
            int num = s.nextInt();
            
            int finalResult = 0;
            int result=1;
            for(int i=1;i<=num;i++)
            {
                result=1;
                int numNested = i;
                for(int iNested=1;iNested<=i;iNested++)
                {
                    result *= numNested;
                    numNested--;
                }
                System.out.println("The factorial for " + i + " is: " + result + ".");
                
                finalResult +=result;
            }
           
            System.out.println("The factorial for " + num + " is: " + finalResult + ".");
        }
    } 
}
