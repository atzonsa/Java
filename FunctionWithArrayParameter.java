package myfirstproject;
import java.util.Scanner;
import java.util.Arrays;
public class FunctionWithArrayParameter {
    
    void toPrintArray(int[] arr)
    {
        toPrintArray(arr, false);
    }
    
    void toPrintArray(int[] arr, boolean sort)
    {
        if (sort)
            Arrays.sort(arr);
        
        String message = "";
        
        for (int i=0;i<arr.length;i++)
        {
            message = message+ arr[i] + ", ";
        }
        
        if (sort)
            System.out.println("Following is the sorted print of your array.");
        else
            System.out.println("Following is the print of your array.");
        System.out.println(message);
    }
    
    public static void main(String[] arg)
    {
       while (true)
       {
           System.out.println("Please enter the length for array");
           Scanner s = new Scanner(System.in);
           int arrLen = s.nextInt();

           if (arrLen > 0)
           {
               int[] arr = new int[arrLen];

               System.out.println("Please enter " + arrLen + " values");
               for (int i=0;i<arr.length;i++)
               {
                    arr[i] = s.nextInt();
               }

               FunctionWithArrayParameter obj = new FunctionWithArrayParameter();
               obj.toPrintArray(arr);

               System.out.println("Should be sort the values?");
               if (s.nextBoolean())
               {
                   obj.toPrintArray(arr, true);
               }
           }
           else
           {
               System.out.println("Length must be above zero");
           }       
       }
    }
}