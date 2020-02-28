
package myfirstproject;

import java.util.Scanner;
public class ProductsAndDiscount {
    public static void main(String[] args)
    {
        int product1Val, product2Val,product3Val,product4Val,product5Val;
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter product 1 value");
        product1Val = s.nextInt();
        System.out.println("Please enter product 2 value");
        product2Val = s.nextInt();
        System.out.println("Please enter product 3 value");
        product3Val = s.nextInt();
        System.out.println("Please enter product 4 value");
        product4Val = s.nextInt();
        System.out.println("Please enter product 5 value");
        product5Val = s.nextInt();
        
        double totalAmount, netAmount;
        totalAmount = product1Val + product2Val + product3Val + product4Val + product5Val;
        
        if (totalAmount < 1000)
        {
            System.out.println("Your bill amount is " + totalAmount + ", and you are not eligible for discount.");
        }
        else if (totalAmount > 1000 && totalAmount < 2000)
        {
            netAmount = totalAmount - (totalAmount * 0.02);
            System.out.println("Your bill amount is " + totalAmount + ", and you are eligible for 2% discount. Your net amount payable after discount is " + netAmount + ".");
        }
        else if (totalAmount > 2000 && totalAmount < 5000)
        {
            netAmount = totalAmount - (totalAmount * 0.03);
            System.out.println("Your bill amount is " + totalAmount + ", and you are eligible for 3% discount. Your net amount payable after discount is " + netAmount + ".");
        }
        else if (totalAmount > 5000 && totalAmount < 7000)
        {
            netAmount = totalAmount - (totalAmount * 0.05);
            System.out.println("Your bill amount is " + totalAmount + ", and you are eligible for 5% discount. Your net amount payable after discount is " + netAmount + ".");
        }
        else if (totalAmount > 10000)
        {
            netAmount = totalAmount - (totalAmount * 0.07);
            System.out.println("Your bill amount is " + totalAmount + ", and you are eligible for 7% discount. Your net amount payable after discount is " + netAmount + ".");
        }
    }
}
