package myfirstproject;

import java.util.Scanner;
public class RecursionWithPower {
    int getPower(int num, int power)
    {
        int result = num;
        if (power <= 1)
        {
            return result;
        }
        else
        {
            result *= (getPower(num, power-1));
            return result;
        }
    }
    
    public static void main(String[] arg)
    {
        while (true)
        {
            Scanner s=new Scanner(System.in);

            int num, power;
            System.out.println("Please enter the number");
            num = s.nextInt();
            System.out.println("Please enter the power");
            power = s.nextInt();

            RecursionWithPower obj = new RecursionWithPower();
            System.out.println(obj.getPower(num, power));    
        }
    }
}