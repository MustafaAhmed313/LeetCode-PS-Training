public class Problem21 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int x) {val = x; next = null;}
        ListNode(int x , ListNode next) {val = x; this.next = next;}
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prev = new ListNode(-1);
        ListNode cur = prev;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 == null) cur.next = list2;
        else cur.next = list1;
        return prev.next;
    }
}
