import java.util.LinkedList;
import java.util.Queue;

public class Problem328 {
    public ListNode oddEvenList(ListNode head) {
        int len = 0;//1,2,3
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        if (len <= 2) return head;
        Queue<ListNode> q_odd = new LinkedList<>();
        Queue<ListNode> q_even = new LinkedList<>();
        cur = head;
        int i = 0;
        while (i < len && cur != null) {
            if (i % 2 == 0) q_odd.offer(cur); 
            else q_even.offer(cur); //2
            cur = cur.next;
            i++;
        }
        ListNode odd = q_odd.poll();// 1->3->null
        odd.next = null;
        ListNode curo = odd;
        while (!q_odd.isEmpty()) {
            odd.next = q_odd.poll();
            odd = odd.next;
            odd.next = null;
        }
        ListNode even = q_even.poll(); //2->null
        even.next = null;
        ListNode cure = even;
        while (!q_even.isEmpty()) {
            even.next = q_even.poll();
            even = even.next;
            even.next = null;
        }
        odd.next = cure;
        return curo;//1->3->2->null
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
