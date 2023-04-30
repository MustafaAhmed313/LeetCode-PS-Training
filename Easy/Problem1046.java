import java.util.ArrayList;
public class Problem1046 {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> helper = new ArrayList<>(); //size = 0
        for (int i = 0 ; i < stones.length ; i++) helper.add(stones[i]);
        java.util.Collections.sort(helper);
        for (int i = stones.length - 1 ; helper.size() > 1 ; i--) { // i = 0
            if (helper.get(i) > helper.get(i-1)) {
                helper.set(i-1 , helper.get(i) - helper.get(i-1));
                helper.remove(i);
            }else {
                helper.remove(i--);
                helper.remove(i);
            }
            java.util.Collections.sort(helper);
        }
        if (helper.isEmpty()) return 0; //0
        else return helper.get(0); //1
    }
}
