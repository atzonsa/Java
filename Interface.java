package myfirstproject;

interface printable{  
    void print();  
}

class A6 extends Bank implements printable, Printables{  
    public void print()
    {
        System.out.println("Hello");
    }  
}

public class Interface {
    public static void main(String args[])
    {  
        A6 obj = new A6();  
        obj.print();  
    }
}