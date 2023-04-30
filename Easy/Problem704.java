public class Problem704 {
    public int search(int[] nums, int target) {
        int answer = -1 , l = 0 , r = nums.length - 1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (nums[mid] == target) {
                answer = mid;
                break;
            }else if (nums[mid] > target) {
                r = mid-1;
            }else l = mid+1;
        }
        return answer;
    }
}
