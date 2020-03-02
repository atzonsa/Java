package myfirstproject;
import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        while (true)
        {
            int result = 1;
            System.out.println("Please enter the number");
            int num = s.nextInt();

            while (num >=1)
            {
                result *= num;
                num--;
            }
    
            System.out.println("The factorial for " + num + " is: " + result + ".");
        }
    }       
}