package myfirstproject;

import java.util.Scanner;
public class StringAddress {
    
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        String address = s.nextLine();
        String wrongHouseNo = "";
        String houseNo23 = "23";
        String houseNo203 = "203";
        if (address.indexOf(houseNo23) < 0)
        {
            System.out.println("hello");
            //Hno 123 H.no. H. No.
            //House no
            //23/b
            
            if (address.contains("Hno"))
            {
                String tempstr = "";
                tempstr = address.substring(address.indexOf("Hno")+4, address.indexOf(" ",address.indexOf("Hno")+4));
                //wrongHouseNo = address.substring(address.indexOf("Hno"), 0);
                
            System.out.println("Hello "+tempstr.length());
                address = address.replace(tempstr, houseNo203);
            }
            else if (address.contains("H.no."))
            {

            }
        }
   
        System.out.println(address);
    }
    
}
