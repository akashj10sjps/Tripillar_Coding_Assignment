package com.tripillar_coding_assignment.module13;

public class CountNodes {
    Node root;
    public int countNodes(Node node){
        if(node==null){
            return 0;
        }
        int leftCount=countNodes(node.left);
        int rightCount=countNodes(node.right);
        return 1+leftCount+rightCount;
    }
    public static void main(String[] args){

        CountNodes tree = new CountNodes();

        // creating binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Total number of nodes: " + tree.countNodes(tree.root));
    }

}
