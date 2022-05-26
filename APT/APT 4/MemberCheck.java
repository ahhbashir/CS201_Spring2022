import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, 
                                  String[] club2, 
                                  String[] club3) {
           // TODO: fill in code here
        TreeSet<String> finalSet = new TreeSet<String>();
        String finalarr [] = new String[finalSet.size()];
        
        for (int i = 0; i < club1.length; i++) {
            for (int j = 0; j < club2.length; j++) {
                if (club2[j].equals(club1[i])) {
                    finalSet.add(club2[j]);
                }
            }
        }

        for (int i = 0; i < club1.length; i++) {
            for (int j = 0; j < club3.length; j++) {
                if (club3[j].equals(club1[i])) {
                    finalSet.add(club3[j]);
                }
            }
        }

        for (int i = 0; i < club2.length; i++) {
            for (int j = 0; j < club3.length; j++) {
                if (club3[j].equals(club2[i])) {
                    finalSet.add(club3[j]);
                }
            }
        }

        return finalSet.toArray(finalarr);
    }
 }