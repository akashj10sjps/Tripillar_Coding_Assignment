package com.tripillar_coding_assignment.module13;
class Node1 {
    int data;
    Node1 left, right;
    Node1(int value){
        data = value;
        left = right = null;
    }
}
public class InOrderTraversal {
        Node1 root;

        void inorder(Node1 node){
            if(node != null){
                inorder(node.left);
                System.out.print(node.data + " ");
                inorder(node.right);
            }
        }

        public static void main(String[] args){
            InOrderTraversal tree = new InOrderTraversal();
            tree.root = new Node1(1);
            tree.root.left = new Node1(2);
            tree.root.right = new Node1(3);

            tree.inorder(tree.root);
        }
    }
