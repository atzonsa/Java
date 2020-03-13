package myfirstproject;

interface Printable{  
     int money = 1000;
    
    void print();  
}  
interface Showable{  
    void show();  
}  
interface Hideable{  
    void hide();
    void hideTwo();
}  

abstract class A7 implements Printable,Showable,Hideable{  
    final static int money = 1000;
    
    @Override
    public void print()
    {
        System.out.println("Hello");
    }  
    
    @Override
    public void show(){
        System.out.println("Welcome");
    }
    
    @Override
    public void hide()
    {
        System.out.println("Hello");
    }
}  

public class InterfaceMultiple extends A7 {
    @Override
    public void hideTwo()
    {
        System.out.println("Hello");
    }
    
    public static void main(String args[])
    {  
        InterfaceMultiple obj = new InterfaceMultiple();  
        obj.print();  
        obj.show();  
        obj.hide();
        obj.hideTwo();
    }    
}