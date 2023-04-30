import java.util.Queue;
import java.util.LinkedList;
public class Problem933 {
    class RecentCounter {
        Queue<Integer> requests;
        public RecentCounter() {requests = new LinkedList<>();}
        public int ping(int t) {
            requests.offer(t);
            while (requests.peek() < t - 3000)
                requests.poll();
            return requests.size();
        }
    }
}
