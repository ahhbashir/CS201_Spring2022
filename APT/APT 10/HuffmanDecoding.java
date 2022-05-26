import java.util.ArrayList;
import java.util.Arrays;

public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        String[] allBits = archive.split("");
        String answer = "";
        ArrayList<String> dicCopy = new ArrayList<>(Arrays.asList(dictionary));
        String holder = "";
        for (String bit : allBits){
            holder += bit;
            if (dicCopy.contains(holder)){
                answer += findLetter(holder, dicCopy);
                holder = "";
            }
        }
        return answer;
    }

    private String findLetter(String code, ArrayList<String> words){
        char counter = 'a';
        for (String x : words){
            if (code.equals(x)){
                break;
            }
            counter += 1;
        }
        return ("" + counter).toUpperCase();
    }
}
