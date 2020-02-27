package myfirstproject;

abstract class Banking
{
    String manager = "Ram Sharma";
    abstract void printInterestRate();
    
    void displayManagerName()
    {
        System.out.println("Manager name is: " + manager);
    }
}

public class AbstractClass extends Banking {
    void printInterestRate()
    {
        System.out.println("Rate is 8%");
    }
    
    public static void main (String[] arg)
    {
        AbstractClass obj = new AbstractClass();
        obj.printInterestRate();
        obj.displayManagerName();
    }
}