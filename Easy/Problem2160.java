import java.util.*;

public class Problem2160 {
    public int minimumSum(int num) {
        int[] a = new int[4];
        for (int i = 0 ; i < 4 ; i++) {
            a[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(a);
        String s1 = "" + a[0] + a[2];
        String s2 = "" + a[1] + a[3];
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
}
