import java.util.Stack;
public class Problem392 {
    public static boolean isSubsequence(String s, String t) {
        Stack<Character> S = new Stack<>();
        Stack<Character> T = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) S.push(s.charAt(i));
        for (int i = 0 ; i < t.length() ; i++) T.push(t.charAt(i));
        int count = 0;
        while (!T.isEmpty()) {
            if (T.pop() == S.peek()) {
                count++;
                S.pop();
            }
        }
        return count == s.length();
    }
}
