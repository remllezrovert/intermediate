/**
   A tester class for Sentence.
*/
public class Sentence2Demo
{
   public static void main(String[] args)
   {
      Sentence2 s = new Sentence2("Mississippi!");
      
      int n = s.findv2("sip");
      System.out.println(n);
      System.out.println("Expected: 6");      
      
      n = s.findv2("tip");
      System.out.println(n);
      System.out.println("Expected: -1");






      //new testing cases

      n = s.findv2("pi");
      System.out.println(n);
      System.out.println("Expected: 9");      

       n = s.findv2("hello");
      System.out.println(n);
      System.out.println("Expected: -1");
	     


	  //add two more testing cases 
	  //(one case return a positive index, another case return -1)
	  
   }
}

/**
   class Sentence2
*/
class Sentence2
{
   private String phrase;

   /**
      Construct a Sentence object.
      @param aPhrase the sentence
   */
   public Sentence2(String aPhrase)
   {
      phrase = aPhrase;
   }
   
   /**
      Finds a string of text in a sentence.
      @param text the string to find.
      @return the position where the text is found

   */
   public int findv2(String text)
   {
      return find(text, 0);
   }
   
   /**
      Helper method to find the index of a string.
      @param text the string to find
      @param index the starting index to search
      @return the position where the text is found
   */
   private int find(String text, int index)
   {
      if (phrase.startsWith(text)) //get substring with the same length as 'text'
      {
         return index;
      } 
      else if (text.length() >= phrase.length() || phrase.length() <= 0)
      {
         return -1;
      }
      else 
      {
         index += 1;
         StringBuilder sb = new StringBuilder(phrase);
         sb.deleteCharAt(0);
         sb.toString();
      return new Sentence2(sb.toString()).find(text, index);
   } 
     //add your code here to complete this method
	   
   }
}

