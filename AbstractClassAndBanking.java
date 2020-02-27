package myfirstproject;

abstract class Banks
{
    abstract int getRateOfInterest();    
}

class SBIDelhi extends Banks{    
    int getRateOfInterest(){
        return 7;
    }    
}    
class PNBDelhi extends Banks{    
    int getRateOfInterest(){
        return 8;
    }    
}    

public class AbstractClassAndBanking {
    public static void main(String args[]){    
        Banks b;  
        b=new SBIDelhi();  
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
        b=new PNBDelhi();  
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
    }
}