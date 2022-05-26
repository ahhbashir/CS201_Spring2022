public class PathSum {
    public int hasPath(int target, TreeNode tree){
        // replace with working code
        if (tree == null) {
            return 0;
        }
            if(tree.left == null && tree.right == null) {
            if (target == tree.info){
                return 1;
            }
            return 0;
        }

        int lSum = hasPath(target-tree.info, tree.left);
        int rSum = hasPath(target-tree.info, tree.right);
        if (lSum == 1 || rSum == 1) {
            return 1;
        }
        return 0;
    }
}