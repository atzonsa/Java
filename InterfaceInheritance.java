package myfirstproject;

interface Printables{  
    void print();  
}  
interface Showables extends Printables{  
    void show();  
}  

public class InterfaceInheritance implements Showables{
    @Override
    public void print()
    {
        System.out.println("Hello");
    }  
    
    @Override
    public void show(){
        System.out.println("Welcome");
    }
    
    public static void main(String args[])
    {  
        InterfaceInheritance obj = new InterfaceInheritance();  
        obj.print();  
        obj.show();  
     }    
}