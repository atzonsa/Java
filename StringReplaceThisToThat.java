package myfirstproject;

public class StringReplaceThisToThat {

    public static void main(String[] arg)
    {
       String paragraph = "What is this, why is this, who is this, how is this";
       
       System.out.println(paragraph);
       
       while (paragraph.indexOf("this") >= 0)
       {
           String tempStr = paragraph.substring(paragraph.indexOf("this"), paragraph.indexOf("this")+4);
           System.out.println(tempStr);
           System.out.println(tempStr.length());
           
           paragraph = paragraph.replace("this", "that");
       }
       
       System.out.println(paragraph);
    }
}