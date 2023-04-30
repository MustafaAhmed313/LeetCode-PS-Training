import java.util.Deque;
import java.util.LinkedList;
public class Problem682 {
    class MyStack {
        Deque<Integer> deq;
        public MyStack() {deq = new LinkedList<>();}
        public void push(int x) {deq.addLast(x);}
        public int pop() {return deq.removeLast();}
        public int top() {return deq.getLast();}
        public boolean empty() {return deq.isEmpty();}
    }
}
