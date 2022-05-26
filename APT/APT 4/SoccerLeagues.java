public class SoccerLeagues {
    public int[] points(String[] matches) {
        // you write code here
    int[] fPoints = new int [matches.length];

    for (int i  = 0; i < matches.length; i++) {
        String[] record = matches[i].split("");
        for (int k = 0; k < record.length; k++) {
            int cPoints = 0;
            int points = 0;
            if (record[k].equals("W")) {
                cPoints += 3;
            } if (record[k].equals("D")) {
                points += 1;
                cPoints += 1;
            } if (record[k].equals("L")) {
                points += 3;
            }
            fPoints[k] += points;
            fPoints[i] += cPoints;
        }
    }
    return fPoints;
    }
}