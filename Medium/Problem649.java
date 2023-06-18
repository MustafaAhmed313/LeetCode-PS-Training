import java.util.*;
public class Problem649 {
    public static void main(String[] args) {
        System.out.print(predictPartyVictory("RD"));
    }
    public static String predictPartyVictory(String senate) {
        String ans = ""; 
        Queue<Character> q = new LinkedList<>();
        for (int i = 0 ; i< senate.charAt(i) ; i++) q.add(senate.charAt(i));
        while(!q.isEmpty()) {
            char a = q.poll(); //R
            if (q.isEmpty() || a == q.peek()) {
                if (a == 'R') ans = "Radiant";
                else ans = "Dire";
                break;   
            } else {
                q.poll(); //FALSE
                if (a == 'R') ans = "Radiant"; //T
                else ans = "Dire";
            }
        }
        return ans;
    }
}
