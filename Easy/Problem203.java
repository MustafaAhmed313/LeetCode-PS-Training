public class Problem203 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int x) {val = x; next = null;}
        ListNode(int x , ListNode next) {val = x; this.next = next;}
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode cur = new ListNode();
        cur.next = head;
        ListNode prev = cur;
        while (prev.next != null) {
            if (prev.next.val == val)
                prev.next = prev.next.next;
            else {
                prev = prev.next;
            }
        }
        return cur.next;
    }
}
