public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
          // fill in code here
                int count = 0;
                int[] hCount = getCounts(headlines);
                for (String s : messages) {
                    int[] mCount = getCounts(s.split(" "));
                    count += countAdd(hCount, mCount);
                }
        return count;
    }

    private int countAdd(int[] a, int[] b) {
        for (int i = 97; i < 123; i++) {
            if (a[i] < b[i]) {
                return 0;
            }
        }
    return 1;
    }

    private int[] getCounts(String[] strings) {
        int[] counts = new int[300];
        for (String s : strings) {
            for (char ch : s.toLowerCase().toCharArray()) {
                counts[ch] += 1;
            }
        }
    return counts;
    }
 }