public class Problem938 {
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int sum = 0;
        sum += rangeSumBST(root.left , low , high);
        if (root.val >= low && root.val <= high) sum += root.val;
        sum += rangeSumBST(root.right , low , high);
        return sum;
    }
}
