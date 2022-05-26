import java.util.*;

public class MedalTable {
    public String[] generate(String[] results) {
       // you fill in this code
    HashMap<String, MedalCountry> map = new HashMap<>();
    
    for (String s : results) {
        String[] data = s.split(" ");
        for (String c : data) {
            if(!map.containsKey(c)) {
                map.put(c, new MedalCountry(c));
            }
        }
        map.get(data[0]).myGold += 1;
        map.get(data[1]).mySilver += 1;
        map.get(data[2]).myBronze += 1;
    }

    ArrayList<MedalCountry> list = new ArrayList<>(map.values());
    Comparator<MedalCountry> gold = Comparator.comparing(MedalCountry :: getGold).reversed().thenComparing(Comparator.comparing(MedalCountry::getSilver).reversed()).thenComparing(Comparator.comparing(MedalCountry::getBronze).reversed()).thenComparing(Comparator.comparing(MedalCountry::getName));

    Collections.sort(list,gold);
    String[] ret = new String[list.size()];

    for (int i = 0; i < ret.length; i++) {
        ret[i] = list.get(i).toString();
    }

    return ret;
    }
    public class MedalCountry{
        String myCountry;
        public int myGold;
        public int mySilver;
        public int myBronze;
        public MedalCountry(String country){
            myCountry = country;
            myGold = 0;
            mySilver = 0;
            myBronze = 0;
        }

        public String toString(){
            return String.format("%s %d %d %d",myCountry,myGold,mySilver,myBronze);
        }

        public String getName(){
            return myCountry;
        }

        public int getGold(){
            return myGold;
        }
        public int getSilver(){
            return mySilver;
        }
        public int getBronze(){
            return myBronze;
        }
    }
  }