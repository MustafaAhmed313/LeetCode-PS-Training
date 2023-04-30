public class Problem725 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] parts = new ListNode[k];
        int len = length(head) , extra , partWidth;
        extra = len % k; //0 <= extra = 1 < k
        partWidth = len / k;
        ListNode current = head;
        ListNode newHead = head;
        for (int i = 0 ; current != null && i < k ; i++){
            parts[i] = current;
            int sizeOfPart = (extra > 0) ? partWidth + 1 : partWidth;
            for (int j = 0 ; j < sizeOfPart ; j++) {
                newHead = current;
                current = current.next;
            }
            newHead.next = null;
            extra--;
        }
        return parts;
    }
    public int length(ListNode head) {
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        return len;
    }
}
