import java.util.Stack;
public class Problem232 {
    class MyQueue {
        Stack<Integer> queue;
        public MyQueue() {
            queue = new Stack<>();
        }
        public void push(int x) {
            queue.push(x);
        }
        //stack: 1 , 2
        public int pop() {
            Stack<Integer> helper = new Stack<>();
            while (queue.size() != 1) helper.push(queue.pop());
            int element = queue.pop();
            while (!helper.isEmpty()) queue.push(helper.pop());
            return element;
        }
        //helper:
        public int peek() {
            int element = 0;
            Stack<Integer> helper = new Stack<>();
            while (!queue.isEmpty()) {
                if (queue.size() == 1) {
                    element = queue.pop(); // 1
                    helper.push(element);
                }
                else helper.push(queue.pop());
            }
            while (!helper.isEmpty()) queue.push(helper.pop());
            return element; // return 1
        }
        public boolean empty() {
            return queue.size() == 0;
        }
    }
}
