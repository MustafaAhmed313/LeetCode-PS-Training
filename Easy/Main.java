import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeNode n = new TreeNode(10 , new TreeNode(5 , new TreeNode(3) , new TreeNode(7)) ,
                new TreeNode(15 , null , new TreeNode(18)));

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

