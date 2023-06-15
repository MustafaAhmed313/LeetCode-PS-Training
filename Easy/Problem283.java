import java.util.*;
public class Problem283 {
    public void moveZeroes(int[] nums) {
        List<Integer> l = new ArrayList<>(); //0 0 1
        int zero = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 0) zero++; // 2
            l.add(nums[i]);
        }  // 0 1 0
        int j = 0;    
        while (zero != 0) {
            if (l.get(j) == 0){
                l.add(l.remove(j));
                zero--;
            }else j++; 
        }
        for (int i = 0 ; i < nums.length ; i++) nums[i] = l.remove(0);
        System.out.println(Arrays.toString(nums));
    }
}