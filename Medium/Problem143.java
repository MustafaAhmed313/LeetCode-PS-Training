import java.util.ArrayList;

public class Problem143 {
    public void reorderList(ListNode head) {
        ArrayList<ListNode> l = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            l.add(cur);
            cur = cur.next;
        }//1,2,3,4,5 | 1,2,3,4
        ListNode prev = new ListNode();
        prev.next = l.remove(0);
        cur = prev.next;
        while (!l.isEmpty()) {
            ListNode n = null;
            n = l.remove(l.size() - 1);
            n.next = null;
            cur.next = n;
            cur = cur.next;
            if (!l.isEmpty()) {
                n = l.remove(0);
                n.next = null;
                cur.next = n;
                cur = cur.next;
            }
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