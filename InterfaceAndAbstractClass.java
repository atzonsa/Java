package myfirstproject;

interface AInterface{  
    void aFunction();  
    void bFunction();  
    void cFunction();  
    void dFunction();  
}  

abstract class BAbstractClass implements AInterface{  
    public void cFunction()
    {
        System.out.println("I am c");
    }  
}  

class MClass extends BAbstractClass{  
    public void aFunction()
    {
        System.out.println("I am a");
    }  
    
    public void bFunction()
    {
        System.out.println("I am b");
    }  
    
    public void dFunction()
    {
        System.out.println("I am d");
    }  
}  

public class InterfaceAndAbstractClass {
    public static void main(String args[])
    {  
        AInterface a=new MClass();  
        a.aFunction();  
        a.bFunction();  
        a.cFunction();  
        a.dFunction();  
    }   
}
