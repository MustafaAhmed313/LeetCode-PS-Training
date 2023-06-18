import java.util.*;
public class Problem735 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{8 , -8})));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        st.push(asteroids[asteroids.length - 1]); //-8
        for (int i = asteroids.length - 2 ; i >= 0 ; i--) { //10 > 0 && -5 > 0
            if ((asteroids[i] > 0 && st.peek() > 0) ||
                (asteroids[i] < 0 && st.peek() < 0)) st.push(asteroids[i]);
            else if (asteroids[i] == -1*st.peek()) { 
                st.pop();
                i++;
            }
            else if (Math.abs(asteroids[i]) > Math.abs(st.peek())) { //10 > 5
                st.pop();
                st.push(asteroids[i]);
            }
        }
        if (st.isEmpty()) return null;
        int[] ans = new int[st.size()];
        for (int i = 0 ; i < ans.length ; i++) ans[i] = st.pop();
        return ans;
    }
}