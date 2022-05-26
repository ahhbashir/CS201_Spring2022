import java.util.*;

public class UniqueTreeValues {
    private TreeSet<Integer> total;

    public int[] unique(TreeNode root) {
       total = new TreeSet<>();
       helpMe(root);
       int[] ret = new int[total.size()];
       int idx = 0;
       for (Integer i : total) {
           ret[idx] = i;
           idx += 1;
       }
       return ret;
       }

    private void helpMe(TreeNode root){
        if (root == null){
            return;
        }
        total.add(root.info);
        helpMe(root.left);
        helpMe(root.right);
    }
}
