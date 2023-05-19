import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("LEET" , "CODE"));
    }//str1 = ABABAB , str2 = AB
    public static String gcdOfStrings(String str1, String str2) {
        String s2 = "";
        for (int i = 0 ; i < str2.length() ; i++)
            if (s2.indexOf(str2.charAt(i)) == -1) s2 += str1.charAt(i);
        boolean flag = false;
        int step = s2.length();
        for (int i = 0 ; i < str1.length() - step ; i += step) {
            String s1 = str1.substring(i, i + s2.length());
            if (!s1.equals(s2)) {
                flag = true;
                break;
            }
        }
        return (flag)? "" : s2;
    }
}