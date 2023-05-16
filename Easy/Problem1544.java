import java.util.ArrayList;
public class Problem1544 {
    public String makeGood(String s) {
        ArrayList<Character> d = new ArrayList<>();//l
        String ans = "";
        d.add(s.charAt(0)); //
        for (int i = 1 ; i < s.length() ; i++) { //
            if (!d.isEmpty()) {
                if (Character.isUpperCase(d.get(d.size() - 1)) && Character.isLowerCase(s.charAt(i))) {
                    if (d.get(d.size() - 1) + 32 == s.charAt(i)) d.remove(d.size() - 1);
                    else d.add(s.charAt(i));
                } else if (Character.isLowerCase(d.get(d.size() - 1)) && Character.isUpperCase(s.charAt(i))) {
                    if ((d.get(d.size() - 1) - 32) == s.charAt(i)) d.remove(d.size() - 1);
                    else d.add(s.charAt(i));
                } else d.add(s.charAt(i));
            }
            else d.add(s.charAt(i));
        }
        while (!d.isEmpty()) ans += d.remove(0);
        return ans;
    }
}
