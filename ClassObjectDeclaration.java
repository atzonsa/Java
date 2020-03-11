package myfirstproject;
import java.util.Scanner;
public class ClassObjectDeclaration {
int id,fee;
String name;
Scanner s=new Scanner(System.in);

    void getInfo(){
System.out.println("Enter id ,name and fee of student");
id=s.nextInt();
name=s.next();
fee=s.nextInt();

    }
void display(){
System.out.println("Your Details are \nid="+id+"\nName="+name+"\nFee="+fee);
}
public static void main(String[]arg){
    ClassObjectDeclairation Naveen=new ClassObjectDeclairation();
    new ClassObjectDeclairation().getInfo();
    Naveen.getInfo();
    Naveen.display();
    ClassObjectDeclairation Ravi=new ClassObjectDeclairation();
    Ravi.getInfo();
    Ravi.display();
    ClassObjectDeclairation n;
    //n.getInfo();
}

}
