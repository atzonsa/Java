package myfirstproject;
import java.util.Scanner;
public class ClassNested {
    public class innerClass{
        int plus(Scanner s){
           return plus(s.nextInt(), s.nextInt()); 
        }
        
        int plus(int val1, int val2){
           return (val1 + val2); 
        }
    }
    
    public static void main(String[] arg)
    {
        ClassNested obj1 = new ClassNested();
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter two values for addition");
        System.out.println(obj1.new innerClass().plus(s));
        System.out.println(obj1.new innerClass().plus(s.nextInt(), s.nextInt()));
    }
}