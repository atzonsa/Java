package myfirstproject;
import java.util.Scanner;
public class ClassObjectGetDisplay {
    String firstName, lastName, address, cityName;
    int pinCode, mobileNo;
    
    void setAddress()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your first name, last name, address, city, pin code & mobile no.");
        firstName = s.next();
        lastName = s.next();
        address = s.next();
        cityName = s.next();
        pinCode = s.nextInt();
        mobileNo = s.nextInt();
    }
    
    void getAddress()
    {
        String postalAddress;
        postalAddress = "To, \n" + firstName + " " + lastName + "\n" + address + "\n" + cityName + " - " + pinCode + "\n" + "Mobile No." + mobileNo;
        System.out.println(postalAddress);
    }
    
    public static void main(String[] arg)
    { 
        ClassObjectGetDisplay obj = new ClassObjectGetDisplay();
        obj.setAddress();
        obj.getAddress();
        
        ClassObjectGetDisplay objCopy = new ClassObjectGetDisplay();
        objCopy = obj;
        
        System.out.println("This is a copy of adddress");
        objCopy.getAddress();
    }
}