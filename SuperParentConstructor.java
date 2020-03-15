package myfirstproject;

class AnimalA{  
    AnimalA()
    {
        System.out.println("animal is created");
    }  
}  
class DogA extends AnimalA
{  
    DogA()
    {  
        super();  
        System.out.println("dog is created");  
    }  
}  
      
public class SuperParentConstructor {
    public static void main(String args[])
    {  
        DogA d=new DogA();  
    }
}