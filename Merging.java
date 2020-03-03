package myfirstproject;

import java.util.Scanner;
public class Merging {
public static void main(String []arg){
    int A[]=new int[5];
    int B[]=new int[5];
    int C[]=new int[10];
    System.out.println("Enter five element into A array ");
    int i,j=0,k=0;
    Scanner s=new Scanner(System.in);
  for(i=0;i<5;i++)
  {
      A[i]=s.nextInt();
  }
  System.out.println("Enter five element into B array");
  
    for(i=0;i<5;i++)
  {
      B[i]=s.nextInt();
  }
    System.out.println("After merge A and B , C is =");
    for(i=0;i<10;i++){
        if(i%2==0)
        {
            C[i]=A[j];
            j++;
        }
        else {
            C[i]=B[k];
            k++;
        
        }
       
    } for(i=0;i<10;i++)
        System.out.print(C[i]+" ");
}    
}
