import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        // fill in code here
    TreeMap<String, Integer> map = new TreeMap<>();
    
    for (String datas : data) {
        map.putIfAbsent(datas, 0);
        map.put(datas, map.get(datas) - 1);
    }

    String[] ret = new String[map.size()];

    TreeMap<Integer, ArrayList<String>> wNum = new TreeMap<>();

    for (String s : map.keySet()) {
        wNum.putIfAbsent(map.get(s), new ArrayList<>());
        wNum.get(map.get(s)).add(s);
    }

    int index = 0;

    for (Integer i : wNum.keySet()) {
        ArrayList<String> temp = wNum.get(i);
        Collections.sort(temp);
        for (String s : temp) {
            ret[index] = s;
            index++;
        }
    }
    return ret;
    }
 }