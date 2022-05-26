import java.util.TreeSet;

import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        // replace this with your code
        TreeSet<String> finalSet = new TreeSet<>();

        for (String s : list) {
            finalSet.addAll(Arrays.asList(s.split(" ")));
        }

        return String.join(" ", finalSet);
    }
}