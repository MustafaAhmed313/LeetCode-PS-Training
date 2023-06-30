import java.util.Arrays;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0 ; i < nums.length ; i++) {            
            boolean flag = false; 
            for (int j = 0 ; j < nums.length ; j++)
                if (j != i && nums[i] + nums[j] == target) {
                    if (i > j) {
                        ans[0] = j;
                        ans[1] = i;
                    }else {
                        ans[0] = i;
                        ans[1] = j;
                    }
                    flag = true;
                    break;
                }
            if (flag) break;    
        } 
        return ans;
    }
}
