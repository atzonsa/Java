/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;
import java.util.Scanner;
/**
 *
 * @author RANGA
 */
public class PowerOfNumber {
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
        int result = num;
        while (power >1)
        {
            result *= num;
            power--;
        }
    
            System.out.println("The Power value for " + num + " is: " + result + ".");
            
    }
    
     }

}

