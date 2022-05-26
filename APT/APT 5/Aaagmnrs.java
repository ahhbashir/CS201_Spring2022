import java.util.*;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
       // fill in code here
      ArrayList<String> answer = new ArrayList<>();
      ArrayList<String> next = new ArrayList<>();

      for (int i = 0; i < phrases.length; i ++) {
         String low = phrases[i].toLowerCase();
         String almost = helper(low);
         if (!next.contains(almost)) {
            next.add(almost);
            answer.add(phrases[i]);
         }
      }
      String[] ret = answer.toArray(new String[0]);

       return ret;
    }
   
   private String helper(String low) {
      String what = low.replaceAll(" ", "");
      String[] list = what.split("");
      Arrays.sort(list);
      return String.join("", list);
   }
 }