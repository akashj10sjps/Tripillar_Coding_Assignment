package com.tripillar_coding_assignment.module14;

public class MaxMinInBST {
    Node root;

    Node insert(Node root, int key){
        if(root == null)
            return new Node(key);

        if(key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }
    int findMin(Node root){
       while(root.left!=null){
           root=root.left;
       }
       return root.data;
    }

    int findMax(Node root){

        while(root.right != null)
            root = root.right;

        return root.data;
    }

    public static void main(String[] args){

        MaxMinInBST tree = new MaxMinInBST();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 80);

        System.out.println("Minimum value: " + tree.findMin(tree.root));
        System.out.println("Maximum value: " + tree.findMax(tree.root));
    }
}
