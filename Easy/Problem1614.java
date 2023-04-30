import java.util.Stack;
public class Problem1614 {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == '(') st.push(')');
            else if (s.charAt(i) == ')') {
                if (st.size() > max) max = st.size();
                st.pop();
            }
        }
        return max;
    }
}
