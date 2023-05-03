public class Problem101 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val = val;}
        TreeNode(int val, TreeNode left , TreeNode right) {
            this(val);
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        return equals(root , root);
    }
    public boolean equals(TreeNode n1 , TreeNode n2) {
        if (n1 == null && n2 == null) return true;
        else if ((n1 == null && n2 != null) || (n1 != null && n2 == null))
            return false;
        else
            return n1.val == n2.val &&
                    equals(n1.left , n2.right) &&
                    equals(n1.right , n2.left);
    }
}
