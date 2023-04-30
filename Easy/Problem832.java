public class Problem832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0 ; i < image.length ; i++) {
            for (int j = 0 , l = image[0].length - 1 ; j < l ; j++ , l--) {
                int temp = image[i][j];
                image[i][j] = image[i][l];
                image[i][l] = temp;
            }
            for (int k = 0 ; k < image[0].length ; k++)
                if (image[i][k] == 0) image[i][k] = 1;
                else image[i][k] = 0;
        }
        return image;
    }
}
