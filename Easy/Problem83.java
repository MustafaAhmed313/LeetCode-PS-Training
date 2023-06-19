public class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode cur = head; //2
        int val = cur.val; 
        ListNode startPoint = cur;
        cur = cur.next; //3
        while (cur != null) { //1->2->3->null
            if (cur.val != val) {
                val = cur.val;
                startPoint.next = cur;
                startPoint = startPoint.next;
            }
            cur = cur.next;
        }
        startPoint.next = null;
        return head;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
