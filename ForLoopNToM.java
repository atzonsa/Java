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
public class ForLoopNToM {
    public static void main(String[]arg){
        while (true)
        {
            Scanner s=new Scanner(System.in);
            int sum=0;
            int start, end;
            System.out.println("Please enter the start");
            start = s.nextInt();
            System.out.println("Please enter the end");
            end = s.nextInt();
            sum = start;
            for(int i=start+1;i<=end;i++)
            {
                sum+=i*start;
            }
            System.out.println(sum);
        }      
    }    
}