import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TreeNode n = new TreeNode(10 , new TreeNode(5 , new TreeNode(3) , new TreeNode(7)) ,
                new TreeNode(15 , null , new TreeNode(18)));
        System.out.println(rangeSumBST(n , 7 , 15));
    }
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val < low || root.val > high) return 0;
        return root.val + rangeSumBST(root.left , low , high) +
        rangeSumBST(root.right , low , high);
    }
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

}

