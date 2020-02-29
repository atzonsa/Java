package myfirstproject;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] arg)
    {
while (true)
    {
    Scanner s=new Scanner(System.in);
    
        int start, end;
        System.out.println("Please enter the start");
        start = s.nextInt();
        System.out.println("Please enter the end");
        end = s.nextInt();
        int result = 1;
        int resultFinal = 0;
        while (start<=end)
        {
            int startNested = start;
            int i = 1;
            result = startNested;
            while (i < startNested)
            {
                result *= startNested;
                i++;
            }
            resultFinal += result;
            start++;
        }
    
            System.out.println("The final result is " + resultFinal + ".");
            
    }
    
     }
}

