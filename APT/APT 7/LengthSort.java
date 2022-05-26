import java.util.*;

public class LengthSort {
    public String[] rearrange(String[] values){
        // you write code here and replace statement below
        String [] ret = values;

        Arrays.sort(ret, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        return ret;
    }
}