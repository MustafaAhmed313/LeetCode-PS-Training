import java.util.*;
public class Problem643 {
    public static void main(String[] args) {
        System.out.printf("%.5f \n" , findMaxAverage(new int[]{5}, 1));
    }
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1 && k == 1) return nums[0];
        Arrays.sort(nums);
        double avg = 0;// 0 1 2 3 4 5
        for (int i = 0 ; i < k/2 ; i++) avg += nums[i];
        for (int i = nums.length - 1 ;
         i >= 0 && (nums.length - 1 - i != k - k/2) ;
          i--) avg += nums[i];
        return avg /= k;
    }
    
}
