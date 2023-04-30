import java.util.ArrayList;
public class Problem141 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x , ListNode next) {val = x; this.next = next;}
    }
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            if (list.contains(current)) {
                return true;
            }else {
                list.add(current);
                current = current.next;
            }
        }
        return false;
    }
}
