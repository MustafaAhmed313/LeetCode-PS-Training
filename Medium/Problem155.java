import java.util.ArrayList;
import java.util.Collections;

public class Problem155 {
    class MinStack {
        ArrayList<Integer> l;
        public MinStack() {l = new ArrayList<>();}
        public void push(int val) {l.add(val);}
        public void pop() {l.remove(l.size() - 1);}
        public int top() {return l.get(l.size() - 1);}
        public int getMin() {return Collections.min(l);}
    }
}
