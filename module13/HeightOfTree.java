package com.tripillar_coding_assignment.module13;

public class HeightOfTree {
    Node root;

    int height(Node node){
        // if tree is empty
        if(node == null)
            return 0;

        // find height of left subtree
        int leftHeight = height(node.left);

        // find height of right subtree
        int rightHeight = height(node.right);

        // return the larger height + 1 (for current node)
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args){

        HeightOfTree tree = new HeightOfTree();

        // creating binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of Binary Tree is: " + tree.height(tree.root));
    }
}
