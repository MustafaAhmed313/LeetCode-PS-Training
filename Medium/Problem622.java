public class Problem622 {
    class MyCircularQueue {
        int size , front , rear;
        int[] queue; //[ 1 , 2 , 3] (rear = (rear + 3) % 3)
        public MyCircularQueue(int k) {
            queue = new int[k];
            front = 0; //0
            rear = k - 1; //0
            size = 0; //0
        } //[ , 0 , 0] size = 0; //[1 , 2 , 3];
        public boolean enQueue(int value) {
            if (isFull()) return false;
            size++;
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            return true;
        }
        public boolean deQueue() {
            if (isEmpty()) return false;
            size--;
            front = (front + 1) % queue.length;
            return true;
        }
        public int Front() {
            if (isEmpty()) return -1;
            return queue[front];
        }
        public int Rear() {
            if (isEmpty()) return -1;
            return queue[rear];
        }
        public boolean isEmpty() {
            return size == 0;
        }
        public boolean isFull() {
            return size == queue.length;
        }
    }
}
