
package myfirstproject;
import java.util.Scanner;
public class TeaCoffeeSamosaAndSandwich {
    public static void main(String[] arg)
    {
        int teaPrice=15, coffeePrice=20, samosaPrice=15,sandwichPrice=25;
        int teaQty, coffeeQty, samosaQty,sandwichQty;
        String drinks, snacks;
        
        Scanner s=new Scanner(System.in);
        System.out.println("What would you like to have in drinks today?");
        System.out.println("Option1: Tea, Option2: Coffee");
        drinks = s.next();
           
        switch(drinks){
            case "Tea":
            {
                System.out.println("How many cup of tea you need?");
                teaQty = s.nextInt();
                System.out.println("Please pay: " + (teaPrice*teaQty) + " for drinks.");
                break;
            }
            case "Coffee":
            {
                System.out.println("How many cup of coffe you need?");
                coffeeQty = s.nextInt();
                System.out.println("Please pay: " + (coffeePrice*coffeeQty) + " for drinks.");
                break;
            }
        }
        
        System.out.println("What would you like to have in snacks today?");
        System.out.println("Option1: Samosa, Option2: Sandwich");
        snacks = s.next();
        
        switch(snacks){
            case "Samosa":
            {
                System.out.println("How many samosa's you need?");
                samosaQty = s.nextInt();
                System.out.println("Please pay: " + (samosaPrice*samosaQty) + " for snacks.");
                break;
            }
            case "Sandwich":
            {
                System.out.println("How many sandwiches you need?");
                sandwichQty = s.nextInt();
                System.out.println("Please pay: " + (sandwichPrice*sandwichQty) + " for snacks.");
                break;
            }
        }
    }
}