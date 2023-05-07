public class Problem104 {
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
    public int maxDepth(TreeNode root) { //r = 3
        int d = 0;
        if(root != null) //9 //20
            d = Math.max(1 + maxDepth(root.left) , 1 + maxDepth(root.right));
        return d;
    }
}
