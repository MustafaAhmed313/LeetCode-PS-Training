public class Problem1721 {
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0 , index = 1;
        ListNode idx = null; //2
        ListNode cur = head;
        while (cur != null) {
            if (index == k) {
                idx = cur;
            }
            len++;//5
            index++;//5
            cur = cur.next;
        }
        int revIndex = len - k + 1;
        index = 1;
        cur = head;
        while (cur != null) {
            if (index == revIndex) {
                int temp = cur.val;
                cur.val = idx.val;
                idx.val = temp;
                break;
            }
            index++;
            cur = cur.next;
        }
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
