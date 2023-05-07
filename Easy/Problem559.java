import java.util.List;
public class Problem559 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public int maxDepth(Node root) {
        int d = 0;
        if (root != null) {
            d = 1;
            for (var e : root.children)
                d = Math.max(1 + maxDepth(e) , d);
        }
        return d;
    }
}
