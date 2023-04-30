public class Problem705 {
    class MyHashSet {
        boolean[]a;
        public MyHashSet() {a = new boolean[1000000+1];}
        public void add(int key) {a[key] = true;}
        public void remove(int key) {a[key] = false;}
        public boolean contains(int key) {return a[key];}
    }
}
