import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
      // fill in code here
    TreeMap<String, Integer> map = new TreeMap<>();

    for (String datas : data) {
        if (!map.containsKey(datas)) {
            map.put(datas, 0);
        }
        map.put(datas, map.get(datas) + 1);
    }
    
    int[] ret = new int[map.size()];
    int index = 0;

    for(Integer value : map.values()) {
        ret[index] = value;
        index++;
    }


    return ret;
    }
 }