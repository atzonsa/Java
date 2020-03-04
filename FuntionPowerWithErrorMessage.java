package myfirstproject;
import java.util.Scanner;
public class FuntionPowerWithErrorMessage {
    public static void main(String arg[]){
        while (true)
        {
            FuntionPowerWithErrorMessage obj=new FuntionPowerWithErrorMessage();
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter the value");
            int value = s.nextInt();
            System.out.println("Please enter the power");
            int power = s.nextInt();
            System.out.println(obj.getPower(value, power));            
        }       
    }
    
    String getPower(int value, int power)
    {
        if (value <= 0)
        {
            return "The value can't be zero";
        }
        else if (power < 2)
        {
            return "The power can't be less than 2";
        }
        else
        {
            int result = value;
            while (power >1)
            {
                result *= value;
                power--;
            }
            
            return "The power of " + value + " is: " + result;
        }
    }
}
