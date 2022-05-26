
public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        // change this code
        String[] splits = str.split(" ");
        int[] rtn = new int [words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < splits.length; j++) {
                if (splits[j].equals(words[i])) {
                    rtn[i]+=1;
                }
            }
        }
        
        return rtn;
    }
}