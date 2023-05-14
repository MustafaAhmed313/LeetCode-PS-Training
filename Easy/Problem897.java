import java.util.*;
public class Problem897 {
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
    public TreeNode increasingBST(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        addTreeNode(root , nodes);
        TreeNode cur = nodes.poll();
        cur.left = null;
        TreeNode res = cur; //res1 r 5 r 7
        while (!nodes.isEmpty()) {
            nodes.peek().left = null;
            cur.right = nodes.poll();
            cur = cur.right;
        }
        return res; //5
    } //
    public void addTreeNode(TreeNode root , Queue<TreeNode> q) {
        if (root != null) {
            addTreeNode(root.left , q);
            q.offer(root);
            addTreeNode(root.right , q);
        }
    }
}
