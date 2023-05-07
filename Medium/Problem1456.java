public class Problem1456 {
    public int maxVowels(String s, int k) {
        String vowel = "aeiou";//k = 1 | addd
        int[] prefix = new int[s.length() + 1];
        prefix[0] = 0;
        int max = 0 , count = 0; //3
        for (int i = 0 ; i < s.length() ; i++) { //i = 7
            if (vowel.indexOf(s.charAt(i)) != -1)
                count++;
            prefix[i+1] = count;
        }
        for (int j = 0 ; j <= s.length() - k ; j++) {
            max = Math.max(max , prefix[k+j] - prefix[j]);
        }
        return max;
    }
}
