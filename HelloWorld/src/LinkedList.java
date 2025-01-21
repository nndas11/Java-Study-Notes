public class LinkedList {

    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

    }
}


