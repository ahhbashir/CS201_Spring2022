import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        // you write code here
    ArrayList<String> indiv = new ArrayList<>();

    for (int i = 0; i < sentences.length; i++) {
        String[] b = sentences[i].split(" ");
        for(int j = 0; j < b.length; j++) {
            indiv.add(b[j].toLowerCase());
        }
    }

    Map<String, Integer> map = new HashMap<String, Integer>();
    
    for (String str : indiv) {
        if (map.keySet().contains(str)) {
            map.put(str, map.get(str) + 1);
        } else {
            map.put(str, 1);
        }
    }

    String maxStr = "";
    int maxVal = 0;
    
    for (Map.Entry<String,Integer> entry : map.entrySet()) {
        String key = entry.getKey();
        Integer count = entry.getValue();

        if (count > maxVal) {
            maxVal = count;
            maxStr = key;
        } else if (count == maxVal) {
            if (key.length() < maxStr.length()) {
                maxStr = key;
            }
        } 
    }
    
    return maxStr;
    }
}