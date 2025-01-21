package BinaryTree;

public class BST {

//    Pre-Order Traversal -> N - L - R
//    Used -> when we have to evaluate MATH expression, copy of BT, SERIALIZATION.

//    In-Order Traversal -> L - N - R
//    Used -> In BST, if we do inorder traversal -> we get elements as sorted.

//    Post-Order Traversal -> L - R - N
//    Used -> Delete BT because we have to take care of children first), Bottom-Up calculation.

//    MOST IMP IN TREES
//    BFS AND DFS.

    public static class Node{
        private int val;
        private int height;
        private Node left;
        private Node right;

        public Node(int val){
            this.val = val;
        }

        public int getValue(){
            return val;
        }
    }

    public BST(){}

    public Node root;
    public boolean isEmpty(){
        return root == null;
    }

    public int getHeight(Node node){
        if(node == null)
            return -1;
        return node.height;
    }

    public void display(){
        display(root,"Root Node :");
    }

    public void display(Node node,String details){
        if(node == null)
            return;

        System.out.println(details + node.getValue());
        display(node.left,"left child of " + node.getValue() + ":");
        display(node.right,"right child of " + node.getValue() + ":");
    }

    public void insert(int val){
        root = insert(val,root);
    }

    private Node insert(int val,Node node){
        if(node == null){
            return new Node(val);
        }

        if(val < node.val){
            node.left = insert(val,node.left);
        }

        if(val > node.val){
            node.right =  insert(val,node.right);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        return node;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void populate(int[] nums){
        for(int i=0;i< nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length - 1);
    }

    private void populateSorted(int[] nums,int start,int end){
        if(start >= end)
            return;

        int mid = start + (end - start)/2;
        this.insert(nums[mid]);
        populateSorted(nums,0,mid - 1);
        populateSorted(nums,mid + 1,end);
    }


    public static void main(String[] args) {
        BST tree = new BST();
        tree.populate(new int[]{2,10,1,5,100});
        tree.display();
    }
}
