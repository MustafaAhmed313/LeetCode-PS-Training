import java.util.Stack;
public class Problem844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first = new Stack<>(); //abcd
        Stack<Character> second = new Stack<>(); //bbcd
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) != '#') first.push(s.charAt(i));
            else if (!first.isEmpty()) first.pop();
        } //"bbcd" "abcd"
        for (int i = 0 ; i < t.length() ; i++) {
            if (t.charAt(i) != '#') second.push(t.charAt(i));
            else if (!second.isEmpty()) second.pop();
        }
        if (first.isEmpty() && second.isEmpty()) return true;
        else if (first.size() != second.size()) return false;
        else {
            int n = first.size();
            for (int i = 0 ; i < n ; i++)
                if (first.pop() != second.pop()) return false;
        }
        return true;
    }
}
