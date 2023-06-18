public class Problem2095 {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        if (len == 1) {
            head = null;
            return null;
        }
        int mid = len / 2;
        cur = head;
        int i = 0; 
        while (i < mid-1) {
            cur = cur.next;
            i++;
        } 
        cur.next = cur.next.next;
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
