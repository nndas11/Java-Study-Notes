package CustomQueue;

public class MainQueue {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(100);
        queue.display();
    }
}
