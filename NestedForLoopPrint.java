package myfirstproject;

import java.util.Scanner;

public class NestedForLoopPrint {
    public static void main(String[] arg)
    {
        while (true)
        {
            Scanner s=new Scanner(System.in);
    
            int lines;
            String charater;
            System.out.println("Please enter the charater to print");
            charater = s.next();
            System.out.println("Please enter the number of lines to print");
            lines = s.nextInt();
            int charaterPerLine = 1;
            
            System.out.println("Processing....");
            
            for(int i=1;i<=lines;i++)
            {
                String toPrint = "";
                
                for(int inested=1;inested<=charaterPerLine;inested++)
                {
                    toPrint = toPrint+charater;
                }
                
                System.out.println(toPrint);
                charaterPerLine++;
            }
        }
    
     }
}