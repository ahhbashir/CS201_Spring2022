import java.util.HashSet;
import java.util.Arrays;

public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {
        // you write code here
        HashSet<String> dictSet = new HashSet<>(Arrays.asList(dictionary));
        HashSet<String> uniPlayer = new HashSet<>(Arrays.asList(player));

        int sum = 0;

        for (String word: uniPlayer) {
            if (dictSet.contains(word)) {
                sum += word.length() * word.length();
            }
        }
        return sum;
    }
}