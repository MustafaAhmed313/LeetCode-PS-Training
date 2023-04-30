import java.util.ArrayList;
public class Problem566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) return mat;
        ArrayList<Integer> q = new ArrayList<>();
        for (int i = 0 ; i < mat.length ; i++)
            for (int j = 0 ; j  < mat[0].length ; j++)
                q.add(mat[i][j]);
        int[][] answer = new int[r][c];
        for (int i = 0 ; i < answer.length ; i++)
            for (int j = 0 ; j  < answer[0].length ; j++)
                answer[i][j] = q.remove(0);
        return answer;
    }
}
