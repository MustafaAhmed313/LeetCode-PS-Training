import java.util.*;
public class Problem637 {
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> average = new ArrayList<>(); //3
        Queue<TreeNode> q = new LinkedList<>(); //
        q.add(root);
        while (!q.isEmpty()) {
            double avg = 0; //15+7
            int time = q.size(); //2
            for (int t = 0 ; t < time ; t++) {
                TreeNode cur = q.remove();avg += cur.val;
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            avg /= time;
            average.add(avg);
        }
        return average;
    }
}
