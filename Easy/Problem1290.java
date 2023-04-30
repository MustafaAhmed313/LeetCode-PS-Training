public class Problem1290 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x , ListNode next) {val = x; this.next = next;}
    }
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int decimal = 0;
        while (cur != null) {
            decimal = decimal * 2 + cur.val;
            cur = cur.next;
        }
        return decimal;
    }
}
