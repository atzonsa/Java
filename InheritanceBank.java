package myfirstproject;
import java.util.Scanner;
class Bank{
    int rateofInterest=11;
    double interestCaluculator(double amount, int years)
    {
        return amount*rateofInterest*0.01*years;
    }
}

public class InheritanceBank extends Bank {
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
    
    public static void main(String[] arg)
    {
        InheritanceBank obj = new InheritanceBank();
        obj.getInfo();
        if (obj.checkInfo())
        {
            System.out.println("Your net interest is " + obj.interestCaluculator(obj.loanAmount, obj.loanPeriod));
        }
        else
        {
            System.out.println("Your input is invalid");
        }    
    }
}