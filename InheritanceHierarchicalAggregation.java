package myfirstproject;
import java.util.Scanner;
class ReserveBank{
    int rateofInterest=11;
    double interestCaluculator(double amount, int years)
    {
        return amount*rateofInterest*0.01*years;
    }
}

class SBI extends ReserveBank {
    
    double maxLoanAmount = 500000;
    double loanAmount;
    int maxLoanPeriod = 5;
    int loanPeriod;
    
    void getInfo()
    {
        System.out.println("Please enter the loan amount and period");
        Scanner s = new Scanner(System.in);
        loanAmount = s.nextDouble();
        loanPeriod = s.nextInt();
    }

    boolean checkInfo(){
       if (loanAmount > maxLoanAmount)
       {
            System.out.println("Maximum loan amount is " + maxLoanAmount);
            return false;   
       }
        
       if (loanPeriod > maxLoanPeriod)
       {
            System.out.println("Maximum loan period is " + maxLoanPeriod);
            return false;
       }
       
       return true;
    }
}

class PNB extends ReserveBank {
    
    double maxLoanAmount = 1000000;
    double loanAmount;
    int maxLoanPeriod = 10;
    int loanPeriod;
    
    void getInfo()
    {
        System.out.println("Please enter the loan amount and period");
        Scanner s = new Scanner(System.in);
        loanAmount = s.nextDouble();
        loanPeriod = s.nextInt();
    }

    boolean checkInfo(){
       if (loanAmount > maxLoanAmount)
       {
            System.out.println("Maximum loan amount is " + maxLoanAmount);
            return false;   
       }
        
       if (loanPeriod > maxLoanPeriod)
       {
            System.out.println("Maximum loan period is " + maxLoanPeriod);
            return false;
       }
       
       return true;
    }
}

public class InheritanceHierarchicalAggregation {
    public static void main(String[] arg)
    {
        SBI obj = new SBI();
        obj.getInfo();
        if (obj.checkInfo())
        {
            System.out.println("Your net interest is according to SBI " + obj.interestCaluculator(obj.loanAmount, obj.loanPeriod));
        }
        else
        {
            System.out.println("Your input is invalid for SBI");
        }
        
        PNB objPNB = new PNB();
        objPNB.getInfo();
        if (objPNB.checkInfo())
        {
            System.out.println("Your net interest is according to PNB " + objPNB.interestCaluculator(objPNB.loanAmount, objPNB.loanPeriod));
        }
        else
        {
            System.out.println("Your input is invalid for SBI");
        }
    }
}