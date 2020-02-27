package myfirstproject;
//public means accessible everywhere
//default(no modifier mentioned) means public but in a different way
//private means private to the respective scope
//protected means not accessible in private scope
class A{
 int abc=12;
}
 class AccessModifier extends A {
   
   private void display(){
       
    System.out.println(abc);
    }
    public static void main(String[]arg){
        AccessModifier obj=new AccessModifier();
       obj.display();
    }
}
