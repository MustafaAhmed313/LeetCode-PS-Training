public class Problem160 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x; next = null;}
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            if (curA != null) curA = curA.next;
            else curA = headB;
            if (curB != null) curB = curB.next;
            else curB = headA;
        }
        return curA;
    }
}
