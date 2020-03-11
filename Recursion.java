package myfirstproject;
//function recursion
public class Recursion {
    int fact(int num){
        int res=1;
        if(num<=1)
            return 1;
        else {
            res=num*fact(num-1);//5*(4*(3*(2*1))
            return res;
        }
    }
    
    public static void main(String []arg){
        Recursion obj=new Recursion();
        System.out.println(obj.fact(5));
    }
}
