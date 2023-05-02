import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOddBit(2)));
        //Testing goes here!
        List<E>
    }
    public static int[] evenOddBit(int n) {
        int[] answer = new int[2];
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                if (count % 2 == 0) answer[0]++;
                else answer[1]++;
            }
            count++;
            n >>= 1;
        }
        return answer;
    }
}
