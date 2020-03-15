
package myfirstproject;
public class StringFirstLetterUpper {
    public static void main(String[] arg)
    {
       String paragraph = "what is this, why is this, who is this, how is this,";
       StringBuilder paragraphUpperCase = new StringBuilder();
       System.out.println(paragraph);
       String[] arr = paragraph.split(",");
       
       System.out.println(arr.length);
       
       for (String val:arr)
       {
           val = val.trim();
           val = val.substring(0, 1).toUpperCase() + val.substring(1, val.length());
           
           System.out.println(val);
           paragraphUpperCase.append(val);
           paragraphUpperCase.append(". ");
       }
       
       System.out.println(paragraphUpperCase);
    }
}
