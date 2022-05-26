import java.util.*;

public class Encryption {
    public String encrypt(String message){
        // you write code here
        HashMap<String, Character> map = new HashMap<>();
        String[] chars = message.split("");
        String r = "";
        int c = 0;

        
        for (String ltr : chars) {
            if (!map.containsKey(ltr)) {
                map.put(ltr, (char) (97 + c));
                c++;
            }
            r += map.get(ltr);
        }


        return r;
    }
}