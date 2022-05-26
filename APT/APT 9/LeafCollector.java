import java.util.*;


public class LeafCollector {
    private ArrayList<String> oneRound;

    public String[] getLeaves(TreeNode tree) {
        ArrayList<String> allLeaves = new ArrayList<>();
        oneRound = new ArrayList<>();
        if (tree == null){
            return new String[0];
        }
        while(! isLeaf(tree)){
            transverse(tree);
            ditch(tree);
            allLeaves.add(String.join(" ", oneRound));
            oneRound.clear();
        }
        allLeaves.add("" + tree.info);
        for (int k = 0; k < allLeaves.size(); k += 1){
            String[] store = allLeaves.get(k).split(" ");
            allLeaves.set(k, String.join(" ", store));
        }
        return allLeaves.toArray(new String[0]);
    }

    private void transverse(TreeNode tree) {
        if (tree == null) {
            return;
        }
        if (isLeaf(tree)){
            oneRound.add("" + tree.info);
        }
        transverse(tree.left);
        transverse(tree.right);
    }

    private void ditch(TreeNode tree){
        if (isLeaf(tree) || tree == null){
            return;
        }
        if (isLeaf(tree.left)){
            tree.left = null;
        }
        if(isLeaf(tree.right)){
            tree.right = null;
        }

        ditch(tree.left);
        ditch(tree.right);
    }

    private boolean isLeaf(TreeNode t){
        if (t == null){
            return false;
        }
        return t.left == null && t.right == null;
    }
}
