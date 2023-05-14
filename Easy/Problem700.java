public class Problem700 {
    TreeNode n;
    static class TreeNode {
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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        searchBST(root.left , val);
        if (root.val == val) n = root;
        searchBST(root.right , val);
        return n;
    }
}
