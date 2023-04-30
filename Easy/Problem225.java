import java.util.Stack;
public class Problem225 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>(); //2 , 1 , 0
        int j = 0; //1 , 2 , 0
        for (int i = 0 ; i < pushed.length ; i++) {
            st.push(pushed[i]);
            while (st.size() != 0 && st.peek() == popped[j]) {
                j++;
                st.pop();
            }
        }
        while (st.size() != 0) {
            if (st.pop() != popped[j]) return false;
            j++;
        }
        return true;
    }
}
