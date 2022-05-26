public class LevelCount {
    public int count(TreeNode t, int level) {
        // replace with working code
        if (t == null ) {
            return 0;
        }
        if (level == 0) {
            return 1;
        }

        int nCount = 0;

        nCount += count(t.left, level -1);
        nCount += count(t.right, level-1);
        return nCount;
    }
}