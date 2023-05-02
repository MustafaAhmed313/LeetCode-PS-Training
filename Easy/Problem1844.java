public class Problem1844 {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++ )
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0')
                sb.append(shift(s.charAt(i-1) , s.charAt(i) - '0'));
            else sb.append(s.charAt(i));
        return sb.toString();
    }
    public char shift(char c, int x) {c += x; return c;}
}
