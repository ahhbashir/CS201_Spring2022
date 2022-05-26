import java.util.*;

public class SetAside {
    public String common(String[] list) {
        // replace this with your code
        TreeSet<String> fin = new TreeSet<>(Arrays.asList(list[0].split(" ")));

        for (int i = 0; i < list.length; i++) {
            fin.retainAll(new TreeSet<>(Arrays.asList(list[i].split(" "))));
        }

        return String.join(" ", fin);
    }
}