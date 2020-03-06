
package myfirstproject;

//class and object 
//inheritance 
//polymorphism
//agreegation
//abstraction
//class name{accessmodifier variable 
//function
//}
public class OOPS {
    int a=45,b=343;
    void m(){}

    class Abc
    {
      void show(){
          System.out.println("Hello Friends");
      }    
    }
    void display(){
        Abc obj=new Abc();
        obj.show();
        System.out.println("Hello Display");
    }
    public static void main(String[]arg){
        OOPS obj=new OOPS();
        obj.display();
        obj.new Abc().show();
    }
}