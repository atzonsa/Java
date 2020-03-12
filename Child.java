package myfirstproject;
class Parent{
int bank_balance=50000;
int J_Value=100000;

}
 class Child extends Parent {
int b_balance=20000;

     void getValue(){
b_balance+=bank_balance*50/100+J_Value*.5;
}    
     void display_Balance(){
     System.out.println(b_balance);
     }
     public static void main(String[]arg){
         Child c=new Child();
         c.getValue();
         c.display_Balance();
     }
}
