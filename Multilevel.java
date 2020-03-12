package myfirstproject;
//type of inheritance 1 single inheritance 2 multiple (java dont support with class)
//3 multilevel 4 hierarchical,5 hybrid 6 multipath 
//1 A->B 2 A,B->c 3 A->B->C 4 A->B A->C
import java.util.Scanner;
class input{
int a,b;
Scanner s=new Scanner(System.in);
void get(){
System.out.println("Enter two values");
a=s.nextInt();
b=s.nextInt();
}
}
class process extends input{
void increase(){
a+=100;
b+=200;
}
}
public class Multilevel extends process {
    void display(){
    System.out.println("After increment values are "+a+" "+b);
    }
    public static void main(String arg[]){
        Multilevel m=new Multilevel();
        m.get();
        m.increase();
        m.display();
    }
}
