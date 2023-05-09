import java.util.ArrayList;
import java.util.List;
public class Problem54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int width =  matrix[0].length , hight = matrix.length , cycle = 0;
        int m = hight , n = width;
        int i = 0 , j = 0;
        List<Integer> l = new ArrayList<>();
        while (l.size() != (m * n)) {
            while (j < width) l.add(matrix[i][j++]);j--;i++;
            if (l.size() == m*n)break;
            while (i < hight) l.add(matrix[i++][j]);j--;i--;
            if (l.size() == m*n)break;
            while (j >= cycle) l.add(matrix[i][j--]);j++;i--;
            if (l.size() == m*n)break;
            while (i > cycle) l.add(matrix[i--][j]);j++;i = ++cycle;
            width--;hight--;
        }
        return l;
    }
}
