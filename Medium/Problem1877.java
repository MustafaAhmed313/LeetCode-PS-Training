import java.util.*;
public class Problem1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums); //0 1 2 3
        int max = 0;
        for (int i = 0 , j = nums.length - 1 ; i < j ; i++ , j--)
            if (max < nums[i] + nums[j]) max = nums[i] + nums[j];
        return max;
    }
}
