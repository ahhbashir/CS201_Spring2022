import java.util.Arrays;
import java.util.HashSet;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
       // fill in code here
       for (int i = 0; i < orders.length; i++) {
          if (canMake(orders[i], available)) {
             return i;
          }
       }
       return -1; 
    }

private boolean canMake(String order, String [] available) {
   HashSet<String> set = new HashSet<>(Arrays.asList(available));
   String[] wants = order.split(" ");

   for (int k = 0; k < wants.length; k++) {
      if (!set.contains(wants[k])) {
         return false;
         }
      }  
   return true;
   }
}