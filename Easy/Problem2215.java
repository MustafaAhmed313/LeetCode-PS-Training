import java.util.*;
public class Problem2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> list1 = new HashSet<>();
        for (int i = 0 ; i < nums1.length ; i++) list1.add(nums1[i]);
        Set<Integer> list2 = new HashSet<>();
        for (int i = 0 ; i < nums2.length ; i++) list2.add(nums2[i]);
        List<List<Integer>> answer = new ArrayList<>(2);
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        for (var l1 : list1) {
            if (!list2.contains(l1)) {//123 234
                answer.get(0).add(l1);
            }
        }
        for (var l2 : list2) {
            if (!list1.contains(l2)) {//123 234
                answer.get(1).add(l2);
            }
        }
        return answer;
    }
}
