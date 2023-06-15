import java.util.Stack;

public class Problem334 {
    public boolean increasingTriplet(int[] nums) {
        long i = Long.MAX_VALUE , j = Long.MAX_VALUE;
        for (int k = 1 ; k < nums.length ; k++) {
            if (nums[k] <= i) i = nums[k];
            else if (nums[k] <= j) j = nums[k];
            else return true;
        }
        return false;
    }
}
