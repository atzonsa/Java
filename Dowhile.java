package myfirstproject;

public class Dowhile {
public static void main(String[]arg){
    int i=0,res=1;
    do{
        res*=i;
        i--;
    }while(i>=1);
    System.out.println("result is "+res);
}    
}
