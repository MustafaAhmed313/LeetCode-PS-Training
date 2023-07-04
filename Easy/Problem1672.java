public class Problem1672 {
    public int maximumWealth(int[][] accounts) {
        int m = 0;
        for (int i = 0 ; i < accounts.length ; i++) {
            int sum = 0;
            for (int j = 0 ; j < accounts[0].length ; j++) 
                sum += accounts[i][j];
            m = Math.max(m , sum);
        }
        return m;
    }
}
