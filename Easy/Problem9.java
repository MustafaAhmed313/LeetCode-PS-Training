public class Problem9 {
    public boolean isPalindrome(int x) {
        String s = x + "";
        for (int i = 0 , j = s.length() - 1 ; i <= j ; i++ , j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}