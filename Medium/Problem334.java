import java.util.Stack;

public class Problem334 {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{20,100,10,12,5,13}));
    }
    public static boolean increasingTriplet(int[] nums) {
        Stack<Integer> st = new Stack<>();st.push(nums[0]);
        for (int i = 1 ; i < nums.length && st.size() < 3 ; i++) {
            if (nums[i] < st.peek()) {
                while (!st.isEmpty() && st.peek() > nums[i]) st.pop();
                st.push(nums[i]);
            }else if (nums[i] == st.peek()) {
                continue;
            }
            else st.push(nums[i]);
        }
        return st.size() >= 3;
    }
}
