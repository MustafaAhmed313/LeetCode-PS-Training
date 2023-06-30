public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int len = 0;
        while (cur != null) {len++; cur = cur.next;}
        if (len == 1) return null;
        if (len == n) return head.next;
        int distance = len - (n + 1);
        cur = head; int i = 0;
        while (i < distance) {i++; cur = cur.next;}
        cur.next = cur.next.next;
        return head;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
