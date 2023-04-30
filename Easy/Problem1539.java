import java.util.ArrayList;
public class Problem1539 {
    public int findKthPositive(int[] arr, int k) {
        int max = 0 , i;
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0 ; j < arr.length ; j++) {
            list.add(arr[j]);
            if (arr[j] > max) max = arr[j];
        }
        for (i = 1 ; k != 0 ; i++)
            if (!list.contains(i)) k--;
        return i - 1;
    }
}
