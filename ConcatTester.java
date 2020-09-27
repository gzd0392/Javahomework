package ConcatTester;

   public class ConcatTester
   {
  
   public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
        String s ="";
        s = s.concat(animal1);
        s = s.concat(animal2);
        s = s.concat(article);
        s = s.concat(action);
        int length = s.length();
        System.out.println(+ length);
        
        
     }
}
