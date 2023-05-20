public class Problem605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) return true;
        for (int i = 0 ; i < flowerbed.length ;) {
            if (flowerbed[i] == 1) i += 2;
            else { //1 0 0 0 1
                if ((i == 0 && flowerbed[1] == 0) ||
                    (i == flowerbed.length -1 && flowerbed[flowerbed.length -2] == 0)) {
                        flowerbed[i] = 1;
                        n--;
                        i += 2;
                }
                else if ((i == 0 && flowerbed[1] == 1) ||
                    (i == flowerbed.length -1 && flowerbed[flowerbed.length -2] == 1)) {
                        i += 2;
                }
                else {
                    if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                        i += 2;
                    }
                    else i++;
                }
            }
        }
        return (n <= 0)? true : false;
    } 
}