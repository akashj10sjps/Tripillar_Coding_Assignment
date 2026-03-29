package com.tripillar_coding_assignment.module14;

public class SearchKeyBST {
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

    boolean search(Node root, int key){

        if(root == null)
            return false;

        if(root.data == key)
            return true;

        if(key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args){

        SearchKeyBST tree = new SearchKeyBST();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);

        int key = 30;

        if(tree.search(tree.root, key))
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
