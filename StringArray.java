package myfirstproject;

import java.util.Scanner;
public class StringArray {
public static void main(String []arg){
String names[]=new String[5];
Scanner s=new Scanner(System.in);
System.out.println("Enter any five name");
int i;
for(i=0;i<5;i++)
{
    names[i]=s.nextLine();
    
}
System.out.println("All values are ");
for(i=0;i<5;i++)
{
 System.out.print(names[i]+" ");
    
}
}    
}