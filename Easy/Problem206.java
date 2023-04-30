public class Problem206 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x; next = null;}
        ListNode(int x , ListNode next) {val = x; this.next = next;}
    }
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
