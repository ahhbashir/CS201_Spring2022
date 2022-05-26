import java.util.HashSet;
import java.util.Set;

public class FriendScore {
    private Set<Integer> mySet;

    public int highestScore(String[] friends) {
        int winner = 0;
        mySet = new HashSet<>();
        for (String social : friends) {
            String[] iter = social.split("");
            int idx = 0;
            for (String friend : iter) {
                if (friend.equals("Y")) {
                    mySet.add(idx);
                    helpMe(idx, friends);
                }
                idx += 1;
            }
            if (mySet.size() > winner){
                winner = mySet.size() - 1;
            }
            mySet.clear();
        }
        return winner;
    }

        private void helpMe(int x, String[] y){
            int i = 0;
            for(String check : y[x].split("")){
                if (check.equals("Y")){
                    mySet.add(i);
                }
                i += 1;
            }
        }
}
