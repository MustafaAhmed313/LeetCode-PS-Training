public class Problem724 {
    public int pivotIndex(int[] nums) {
        int ans = -1;
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1 ; i < nums.length ; i++) prefix[i] = nums[i] + prefix[i-1];
        int sum = prefix[nums.length - 1];
        for (int i = 0 ; i < nums.length ; i++) {
            if (prefix[i] - nums[i] == sum - prefix[i]) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
