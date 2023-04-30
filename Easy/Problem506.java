import java.util.Arrays;
public class Problem506 {
    public String[] findRelativeRanks(int[] score) {
        int arr[] = new int[score.length];
        for(int i=0; i<arr.length; i++) arr[i] = score[i];
        Arrays.sort(arr);
        String str[] = new String[arr.length];
        for(int i=0; i<arr.length; i++) {
            if(i==arr.length-3) str[i] = "Bronze Medal";
            else if(i==arr.length-2) str[i] = "Silver Medal";
            else if(i==arr.length-1) str[i] = "Gold Medal";
            else str[i] = String.valueOf(arr.length-i);
        }
        String ans[] = new String[str.length];
        for(int i=0; i<score.length; i++)
            for(int j=0; j<arr.length; j++)
                if(score[i]==arr[j]) ans[i] = str[j];
        return ans;
    }
}
