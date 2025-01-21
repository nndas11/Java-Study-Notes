package BinaryTree;

import java.util.Scanner;

public class BinaryTree {

    private Node root;
    public BinaryTree() {

    }
    private static class Node{
        int val;
        Node left;
        Node right;


        public Node(int val){
            this.val = val;
        }
    }


    public void populate(Scanner scanner){
        System.out.println("Enter the root value:");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner,root);
    }

    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to insert the left of " + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left value of " + node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to insert the right of " + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right value of " + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node root,String indent){
        if(root == null)
            return;
        System.out.println(indent + root.val);
        display(root.left, indent + "\t");
        display(root.right, indent + "\t");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display();
    }
}
