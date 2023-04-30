import java.util.ArrayList;
public class Problem234 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x; next = null;}
        ListNode(int x , ListNode next) {val = x; this.next = next;}
    }
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            list.add(current.val);
            current = current.next;
        }
        for (int i = 0 , j = list.size() - 1 ; i <= j ; i++ , j--)
            if (list.get(i) != list.get(j)) return false;
        return true;
    }
}
