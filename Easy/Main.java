import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
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
    public static void main(String[] args) {
        //Testing goes here;
        TreeNode n = new TreeNode(1 , null , new TreeNode(2 , new TreeNode(3) , null));
        List<Integer> list = inorderTraversal(n);
        for (var e : list) System.out.print(e + " "); //132
//        System.out.println(sumOfLeftLeaves(n));
    }
    public static List<Integer> inorderTraversal(TreeNode root) { //root = 1 null 2 3 null
        List<Integer> l = new ArrayList<>();
        if (root != null) {
            inorderTraversal(root.left);
            l.add(root.val);
            inorderTraversal(root.right);
        }

        return l;
    }
//    public static int sumOfLeftLeaves(TreeNode root) { //1 null 2 3 null
//        if (root == null) return 0; //0 0
//        sumOfLeftLeaves(root.left);
//        return root.val;
//        sumOfLeftLeaves(root.right);
//        return (root.left != null) ? root.left.val : 0; //3
//    }
}
