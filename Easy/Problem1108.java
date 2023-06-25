public class Problem1108 {
    public String defangIPaddr(String address) {
        String s = "[.]";
        String ans = "";
        for (int i = 0 ; i < address.length() ; i++) {
            if (address.charAt(i) == '.') ans += s;
            else ans += address.charAt(i);
        }
        return ans;
    }
}
