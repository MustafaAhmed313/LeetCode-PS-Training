import java.util.Arrays;
public class Problem2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] answer = new int[queries.length]; //1 , 3 , 7 , 12
        for (int i = 1 ; i < nums.length ; i++) nums[i] += nums[i-1];
        for (int i = 0 ; i < answer.length ; i++) {
            int l = 0 , r = nums.length - 1;
            while (l <= r) { //3 , 10 , 21
                int mid = (l + r) / 2;
                if (nums[mid] <= queries[i]) {
                    answer[i] = mid + 1;
                    l = mid + 1;
                }else r = mid - 1;
            }
        }
        return answer;
    }

}
