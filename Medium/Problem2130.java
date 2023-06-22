import java.util.ArrayList;
import java.util.List;

public class Problem2130 {
    public int pairSum(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        int mid = len / 2 , i = 0;
        cur = head;
        List<Integer> l = new ArrayList<>();
        while (i < mid) {
            l.add(cur.val);
            cur = cur.next;
        }
        i--;//-1
        while (cur != null) { //4 , 4
            l.set(i , l.get(i) + cur.val);
            cur = cur.next;
            i--;
        }
        int max = 0;
        while (!l.isEmpty()) {
            int val = l.remove(0);  
            if (val > max) max = val;
        }
        return max;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
