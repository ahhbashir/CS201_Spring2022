public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
       // fill in code here
       long count = 0;

       for (int k  = 0; k < sizes.length; k++) {
           count += sizes[k] / clusterSize;
           if (sizes[k] % clusterSize > 0) {
               count += 1;
           }
       }
       return count * clusterSize;
    }
 }