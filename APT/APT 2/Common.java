import java.util.*;


public class Common {
    public int count (String a, String b) {
       // TODO: fill in code here
       Map<Character, Integer> mp = new HashMap<>();
        int sum = 0;

       for (int i = 0; i < a.length(); i++) {
        mp.put(a.charAt(i), mp.get(a.charAt(i)) == null ? 1 : mp.get(a.charAt(i)) + 1);
       }

       for (int i = 0; i < b.length(); i++) {
          if (mp.get(b.charAt(i)) > 0) {
              sum++;
          }
       }
       return sum;
    }
 }