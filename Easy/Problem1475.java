public class Problem1475 {
    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0 ; i < prices.length ; i++) {
            Boolean flag = false;
            for (int j = i + 1 ; j < prices.length ; j++) {
                if (prices[j] <= prices[i]) {
                    answer[i] = prices[i] - prices[j];
                    flag = true;
                    break;
                }
            }
            if (!flag) answer[i] = prices[i];
        }
        return answer;
    }
}
