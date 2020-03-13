//function overridding

//polymorphism
//1 compile time polymorphism(function overloading)
//2 run time polymorphism(function overriding)

package myfirstproject;
class PP{
    int val = 1000;
    
    PP(){
        System.out.print("Hello");
    }

    void display(){
        System.out.println("PP class is working");
    }
}
public class PolymorphismRunTimeOverRidding extends PP {
    int val = 2000;
    
    PolymorphismRunTimeOverRidding(){
        super();
    }
    
    @Override
    void display(){
        System.out.println("runtime class is working");
    }
    
    void call(){
        super.display();
    }
    
    public static void main(String []arg){
        PolymorphismRunTimeOverRidding rn=new PolymorphismRunTimeOverRidding();
        rn.call();
      
        PP obj = new PP();
        
        System.out.println("Parent class value is " + obj.val);
        System.out.println("Child class value is " + rn.val);
    }
}