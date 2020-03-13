
package myfirstproject;

    interface printable1{  
     void print();  
     interface MessagePrintable{  
       void msg();  
     }  
    }  
public class InterfaceNested implements printable1.MessagePrintable, printable {
    public void print()
    {
        
    }

    @Override
    public void msg() {
         //To change body of generated methods, choose Tools | Templates.
    }
}
