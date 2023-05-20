import java.util.*;
public class Problem151 {
    public static String reverseWords(String s) {
        s = s.trim();
        String help = "";
        Stack<String> st = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) != ' ') help += s.charAt(i);
            else if (s.charAt(i) == ' ' && s.charAt(i-1) != ' ') {
                st.push(help);
                help = "";
            }
            else help = "";
        }
        st.push(help);
        String ans = "";
        while (!st.isEmpty()) ans += st.pop() + " ";
        return ans.substring(0, ans.length() -1);
    }
}
