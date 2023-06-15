public class Problem1318 {
    public static int minFlips(int a, int b, int c) {
        int cnt = 0;
        if ((a | b) == c) return cnt;
        while (a != 0 || b != 0 || c != 0) {
            int bitA = ((a & 1) != 0) ? 1 : 0 , 
            bitB = ((b & 1) != 0) ? 1 : 0 , 
            bitC = ((c & 1) != 0) ? 1 : 0;
            if ((bitA | bitB) != bitC) {
                if (bitA != bitB) cnt++;
                else {
                    if (bitA == 0) cnt++;
                    else cnt += 2;
                }
            }
            a >>= 1;b >>= 1;c >>= 1;
        }
        return cnt;
    }
}
