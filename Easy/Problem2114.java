public class Problem2114 {
    public int mostWordsFound(String[] sentences) {
        int maxnum = 0;
        for (int i = 0 ; i < sentences.length ; i++) {
            int num = sentences[i].split(" ").length;
            if (num > maxnum) maxnum = num;
        }
        return maxnum;
    }
}
