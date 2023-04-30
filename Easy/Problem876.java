public class Problem876 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x; next = null;}
        ListNode(int x , ListNode next) {val = x; this.next = next;}
    }
    public ListNode middleNode(ListNode head) {
        int count = countElements(head) / 2;
        ListNode cur = head;
        while (count != 0) {
            count--;
            cur = cur.next;
        }
        ListNode newHead = cur;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = next;
            cur = cur.next;
        }
        return newHead;
    }
    public int countElements(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}
