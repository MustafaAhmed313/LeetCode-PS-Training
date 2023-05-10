import java.util.*;
public class Problem145 {
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
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.addAll(postorderTraversal(root.left));
        l.addAll(postorderTraversal(root.right));
        l.add(root.val);
        return l;
    }
}
