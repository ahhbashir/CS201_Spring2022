public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
          // fill in code here
      int max = 0;
      String maximum = "";

      for (String strand : strands) {
            int count = 0;
      

            for (int i = 0; i < strand.length(); i++) {
                  if (nuc.equals(strand.substring(i, i + 1))) {
                        count += 1;
                  }
            }
            if (count > max) {
            max = count;
            maximum = strand;
            } else if (count == max && count != 0) {
                  if (strand.length() > maximum.length()) {
                        maximum = strand;
                  }
            }
      }
      return maximum;
    }
 }