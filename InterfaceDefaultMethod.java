package myfirstproject;

interface Drawable1{  
    void draw();  
    
    default void msg()
    {
        System.out.println("default method");
    }  
}  
class Rectangle1 implements Drawable1{  
    @Override
    public void draw()
    {
        System.out.println("drawing rectangle");
    }  
    
    public void msg()
    {
        System.out.println("Normal method");
    }  
    
    public void SuperMSG()
    {
        
    }
}

class Rectangle2 implements Drawable1{  
    @Override
    public void draw()
    {
        System.out.println("drawing rectangle");
    }  
    
    
}

public class InterfaceDefaultMethod {
    public static void main(String args[])
    {  
        Drawable1 d=new Rectangle1();  
        d.draw();  
        d.msg(); 
        d=new Rectangle2();  
        d.draw();  
        d.msg();
    }  
}