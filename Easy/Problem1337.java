import java.util.Arrays;
public class Problem1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        Pair[] military = new Pair[mat.length];
        for (int i = 0 ; i < mat.length ; i++) {
            military[i] = new Pair(i);
            for (int j = 0 ; j < mat[0].length ; j++)
                if (mat[i][j] == 1) {
                    military[i].f++;
                }
        }
        Arrays.sort(military);
        int[] answer = new int[k];
        for (int i = 0 ; i < k ; i++)
            answer[i] = military[i].s;
        return answer;
    }
    static class Pair implements Comparable<Pair>{
        int f = 0;int s;
        public Pair(int y){this.s = y;}
        @Override
        public int compareTo(Pair o) {
            if (this.f > o.f ) return 1;
            else if (this.f < o.f) return -1;
            else return 0;
        }
    }
}
