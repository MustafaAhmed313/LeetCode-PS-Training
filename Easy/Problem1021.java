import java.util.Stack;
public class Problem1021 {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String answer = "";
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == '(') {
                st.push('(');
                if (st.size() > 1)
                    answer += "(";
            }else{
                if (st.size() > 1) {
                    answer += ")";
                    st.pop();
                }else st.pop();
            }
        }
        return answer;
    }
}
