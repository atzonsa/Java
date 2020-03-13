package myfirstproject;

interface BankInterface{  
float rateOfInterest();  
}  
class SBIClass implements BankInterface{  
public float rateOfInterest(){return 9.15f;}  
}  
class PNBClass implements BankInterface{  
public float rateOfInterest(){return 9.7f;}  
}  

public class InterfaceBank {
    public static void main(String[] args){  
        BankInterface b=new SBIClass();  
        System.out.println("ROI: "+b.rateOfInterest());  
    }    
}
