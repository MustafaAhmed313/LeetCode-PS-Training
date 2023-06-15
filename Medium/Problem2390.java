import java.util.Stack;

public class Problem2390 {
    public static String removeStars(String s) {
        String ans = "";
        Stack<Character> st = new Stack<>(); 
        Stack<Character> reverse = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) != '*') st.push(s.charAt(i));
            else st.pop();
        }
        while(!st.isEmpty())reverse.push(st.pop()); 
        while (!reverse.isEmpty()) ans += reverse.pop(); 
        return ans;
    }
}
