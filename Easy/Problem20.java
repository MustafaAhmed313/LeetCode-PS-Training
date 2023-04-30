import java.util.Stack;
public class Problem20 {
    public boolean isValid(String s) {
        String open = "({[";
        String close = ")}]";
        Stack<Character> st = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (open.indexOf(s.charAt(i)) != -1)
                st.push(s.charAt(i));
            else {
                if (st.isEmpty()) return false;
                else if (open.indexOf(st.pop()) != close.indexOf(s.charAt(i)))
                    return false;
            }
        }
        if (!st.isEmpty()) return false;
        else return true;
    }
}
