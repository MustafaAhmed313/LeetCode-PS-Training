import java.util.*;
public class Problem345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        ArrayList<Integer> l = new ArrayList<>();
        String vowels = "aouieAOUIE";
        for (int i = 0 ; i < s.length() ; i++) 
            if (vowels.indexOf(s.charAt(i)) != -1) l.add(i);
        String ans = "";
        if (l.size() == 0) return s;
        for (int i = 0 ; i < s.length() ; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                char a = s.charAt(l.remove(l.size() - 1));
                ans += a;
            }else ans += s.charAt(i);
        } 
        return ans;   
    }
}
