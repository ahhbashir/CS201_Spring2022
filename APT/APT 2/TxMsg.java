import java.util.HashSet;
public class TxMsg {
    public String convert(String s){
        boolean wholeWordVowel = true;
        String ret = "";
        HashSet<String> vowels = new HashSet<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        for (int i = 0; i < s.length(); i++) {
            String currentLetter = s.substring(i, i + 1);
            boolean isVowel = vowels.contains(currentLetter);
            if (isVowel == false) {
                wholeWordVowel = false;

                if (i > 0) {
                    String lastLetter = s.substring(i - 1, i);
                    if (vowels.contains(lastLetter) == true) {
                        ret += currentLetter;
                    }
                }
                else {
                    ret += currentLetter;
                }
            }
        }
        if (wholeWordVowel == true) {
            return s;
        }
        else
            return ret;
    }
    
    public String getMessage(String original) {
        String [] data = original.split(" ");
        String [] ret = new String[data.length];

        for (int k = 0; k < data.length; k++) {
            ret[k] = convert(data[k]);
        }
        return String.join(" ", ret);
    }
}