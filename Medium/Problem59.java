public class Problem59 {
    public int[][] generateMatrix(int n) {
        int e = 1 , cycle = 0 , side = n;
        int[][] matrix = new int[n][n];
        int i = 0 , j = 0;
        while (e <= (n * n)) {
            while (j < side) matrix[i][j++] = e++;j--;i++;
            if (e > n*n)break;
            while (i < side) matrix[i++][j] = e++;j--;i--;
            if (e > n*n)break;
            while (j >= cycle) matrix[i][j--] = e++;j++;i--;
            if (e > n*n)break;
            while (i > cycle) matrix[i--][j] = e++;j++;i = ++cycle;
            side--;
        }
        return matrix;
    }
}
