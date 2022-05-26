public class TreeTighten {

    public TreeNode tighten(TreeNode t) {
        if(t == null){
            return null;
        }
        if (t.left == null && t.right == null){
            return t;
        }

        if (oneChild(t) == 1){
            t.left = tighten(t.left);
            return t.left;
        }
        else if (oneChild(t) == 2){
            t.right = tighten(t.right);
            return t.right;
        }


        t.left = tighten(t.left);
        t.right = tighten(t.right);
        return t;

    }

    private int oneChild(TreeNode tree){
        if(tree.left != null && tree.right == null){
            return 1;
        }
        else if (tree.left == null && tree.right != null){
            return 2;
        }
        return 0;
    }
}
