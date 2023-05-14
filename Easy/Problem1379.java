public class Problem1379 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    TreeNode n;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        check(cloned , target);
        return n;
    }
    public void check(TreeNode cloned , TreeNode target) {
        if (cloned == null) return;
        if (cloned.val == target.val) {
            n = cloned;return;
        }
        check(cloned.left , target);
        check(cloned.right , target);
    }
}
