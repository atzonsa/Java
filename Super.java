package myfirstproject;

class Animal{  
    String color="white"; 
    
    void eat()
    {
        System.out.println("eating...");
    }  
}  

class Dog extends Animal{  
    String color="black";  
    
    void printColor()
    {  
        System.out.println(color);//prints color of Dog class  
        System.out.println(super.color);//prints color of Animal class  
    } 
    
    void eat()
    {
        System.out.println("eating bread...");
    }
    
    void bark()
    {
        System.out.println("barking...");
    }  

    void work(){  
        super.eat();  
        bark();
    }  
}  
   
public class Super {
    public static void main(String args[])
    {  
        Dog d=new Dog();  
        d.printColor();
         
        d.work();  
    }    
}