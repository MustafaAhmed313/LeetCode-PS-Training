import java.util.ArrayList;
import java.util.List;

public class Problem98 {
    public boolean isValidBST(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        traverse(root , l);
        for (int i = 1 ; i < l.size() ; i++)
            if (l.get(i) <= l.get(i-1)) return false;
        return true;
    }
    public void traverse(TreeNode root , List<Integer> l) {
        if (root != null) {
            traverse(root.left , l);
            l.add(root.val);
            traverse(root.right , l);
        }
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
