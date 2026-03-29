package com.tripillar_coding_assignment.module13;
class Node {
    int data;
    Node left, right;
    Node(int value){
        data = value;
        left = right = null;
    }
}
public class PreOrderTraversal {
    Node root;

    void preOrder(Node node){
        if(node != null){
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args){
        PreOrderTraversal tree = new PreOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.preOrder(tree.root);
    }
}
