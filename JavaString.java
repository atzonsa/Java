package myfirstproject;
//String is a sequence of character
//in java String is a class as well as data type
//String is immutable class
//final int x=12;

public class JavaString {
public static void main(String arg[]){
String myname="Praveen";
myname="Ravi Kumar";
System.out.println(myname);//String Pool
String name=new String("Raman");
System.out.println(myname.charAt(0));
System.out.println(myname.compareTo("Ravi "));
System.out.println(myname.compareToIgnoreCase("ravi"));

System.out.println(myname.concat(" Kumar"));
System.out.println(myname.contains("z"));
System.out.println(myname.endsWith("i"));
System.out.println(myname.equals("Ravi"));
System.out.println(myname.indexOf("Ra"));
System.out.println(myname.lastIndexOf("a"));
myname.length();
String arr[]=myname.split(" ");
for(String ss:arr){System.out.println(ss);

}
System.out.println(myname.subSequence(3, 6));

System.out.println(myname.substring(3,7));
System.out.println(myname.length());
myname = "Ravi KUmar Sharma   ";
System.out.println(myname.length());
myname = myname.trim();
System.out.println(myname.length());




}}