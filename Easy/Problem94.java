import java.util.ArrayList;
import java.util.List;

public class Problem94 {
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
    public List<Integer> inorderTraversal(TreeNode root) { //root = 1 null 2 3 null
        if (root == null) return new ArrayList();
        List<Integer> l = new ArrayList<>();
        l.addAll(inorderTraversal(root.left));
        l.add(root.val);
        l.addAll(inorderTraversal(root.right));
        return l;
    }
}
