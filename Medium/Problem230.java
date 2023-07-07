import java.util.ArrayList;
import java.util.List;

public class Problem230 {
    public int kthSmallest(TreeNode root, int k) { 
        List<Integer> l = new ArrayList<>();
        traverse(root , l);
        return l.get(k-1);
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