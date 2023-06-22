import java.util.ArrayList;
import java.util.List;

public class Problem382 {
    class Solution {
        List<Integer> l;
        public Solution(ListNode head) {
            l = new ArrayList<>();
            ListNode cur = head;
            while (cur != null) {
                l.add(cur.val);
                cur = cur.next;
            }
        }
        public int getRandom() {
            int i = (int)(Math.random() * l.size());
            return l.get(i);
        }
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
    

