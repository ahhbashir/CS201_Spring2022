import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // replace this with your code
        ArrayList<String> minReq = new ArrayList<String>();

        for (int i = 0; i < list.length; i++) {
            if (list[i].length() >= minLength) {
                minReq.add(list[i]);
            }
        }
        HashSet<String> set = new LinkedHashSet<>(minReq);
        String[] ret = set.toArray(new String[set.size()]);

        

        return ret;
    }
}