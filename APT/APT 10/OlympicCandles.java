import java.util.ArrayList;
import java.util.Collections;


public class OlympicCandles{
    public int numberOfNights(int[] candles){
        ArrayList<Integer> copy = new ArrayList<>();
        for(int x : candles){
            copy.add(x);
        }
        for (int night = 0; night <= copy.size(); night += 1){
            Collections.sort(copy, Collections.reverseOrder());
            for(int k = 0; k < night; k += 1){
                copy.set(k, copy.get(k) - 1);
                if (copy.get(k) < 0){
                    return night - 1;
                }
            }
        }
        return copy.size();
    }
}
