public class Problem338 {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        for (int i = 1 ; i <= n ; i++) {
            int x = i;
            while(x != 0) {
                if ((x & 1) == 1) answer[i]++;
                x >>= 1;
            }
        }
        return answer;
    }
}
