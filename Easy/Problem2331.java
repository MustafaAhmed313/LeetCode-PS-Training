public class Problem2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 1) return true;
        if (root.val == 0) return false;
        if (root.val == 2) 
            return (evaluateTree(root.left) || evaluateTree(root.right));
        else return (evaluateTree(root.left) && evaluateTree(root.right));
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
