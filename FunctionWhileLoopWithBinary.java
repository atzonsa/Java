package myfirstproject;
import java.util.Scanner;

public class FunctionWhileLoopWithBinary {
    void toBinaryValue(int value){
        int a[] = new int[20];
        int i = 0;
        while (value!=0)
        {
            a[i] = value%2;
            value = value/2;
            i++;
        }
        int j;
        for (j=i-1;j>=0;j--)
        {
           System.out.print(a[j]);    
        }
    }
    
    public static void main(String arg[]){
        FunctionWhileLoopWithBinary obj=new FunctionWhileLoopWithBinary();
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the value");
        int value = s.nextInt();
        obj.toBinaryValue(value);
    }
    //power one power>=2 num!=0
    
    
}