/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;
import java.util.Scanner;
/**
 *
 * @author myapp
 */
public class BlockCode {
    {
        getName();
    }
    
    void getName()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        System.out.println("Your name is " + s.next() + ".");
    }
    
    public static void main(String[] arg)
    {
     new BlockCode();   
    }
}
