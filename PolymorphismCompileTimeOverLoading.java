//function overloading 
//polymorphism
//1 compile time polymorphism(function overloading)
//2 run time polymorphism(function overriding)
//function 
//1sum(int a)
//sum(int a,int b)
//sum(int a,int b,int c)

package myfirstproject;
import java.util.Scanner;
public class PolymorphismCompileTimeOverLoading {
    void sum(int a)
    {
        System.out.println(a + 100);
    }
    void sum(int a, int b)
    {
        System.out.println(a + b);
    }
    void sum(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }
    float sum(char a){ return 0.4f;}
    public static void main(String[] arg)
    {
        PolymorphismCompileTimeOverLoading obj = new PolymorphismCompileTimeOverLoading();
        Scanner s = new Scanner(System.in);
        obj.sum(s.nextInt());
        obj.sum(s.nextInt(), s.nextInt());
        obj.sum(s.nextInt(), s.nextInt(), s.nextInt());
    }
}