public class Problem404 {
    public static class TreeNode {
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
    public int sumOfLeftLeaves(TreeNode root) { //3 . 9 20 . 15 7
        if (root == null) return 0;
        return isExternalLeft(root.left , true) + isExternalLeft(root.right , false);
    }
    public int isExternalLeft(TreeNode n , boolean f) {
        if (n == null) return 0;
        if (n.left == null && n.right == null && f) return n.val;
        return isExternalLeft(n.left , true) + isExternalLeft(n.right , false);
    }
}
