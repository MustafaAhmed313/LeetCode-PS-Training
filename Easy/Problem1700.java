import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Problem1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for (int e : students) q.offer(e);
        for (int i = sandwiches.length - 1 ; i >= 0 ; i--)
            st.push(sandwiches[i]);
        int notEat = 0;
        while (!st.isEmpty()) {
            if (q.peek() == st.peek()) {
                st.pop();
                q.poll();
                notEat = 0;
            }else {
                notEat++;
                q.offer(q.poll());
                if (notEat == q.size()) return notEat;
            }
        }
        return 0;
    }
}
