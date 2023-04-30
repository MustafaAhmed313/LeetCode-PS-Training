public class Problem1768 {
    public String mergeAlternately(String word1, String word2) {
        String answer = "";
        if (word1.length() == word2.length()) {
            for (int i = 0 ; i < word1.length() ; i++) {
                answer += (word1.charAt(i) + "");
                answer += (word2.charAt(i) + "");
            }
        }else if (word1.length() < word2.length()) {
            int i = 0;
            for (; i < word1.length() ; i++) {
                answer += (word1.charAt(i) + "");
                answer += (word2.charAt(i) + "");
            }
            while (i < word2.length()) {
                answer += (word2.charAt(i) + "");
                i++;
            }
        }else {
            int i = 0;
            for (; i < word2.length() ; i++){
                answer += (word1.charAt(i) + "");
                answer += (word2.charAt(i) + "");
            }
            while (i < word1.length()) {
                answer += (word1.charAt(i) + "");
                i++;
            }
        }
        return answer;
    }
}
