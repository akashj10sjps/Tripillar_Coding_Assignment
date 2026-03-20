package com.tripillar_coding_assignment.module12;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Original :"+stack);
        reverse(stack);
        System.out.println("Reversed :"+stack);
        //Using Collections
        Collections.reverse(stack);
        System.out.println(stack);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        int top=stack.pop();
        reverse(stack);
        insertAtBottom(stack,top);
    }

    private static void insertAtBottom(Stack<Integer> stack, int element) {
            if(stack.isEmpty()){
                stack.push(element);
                return;
            }
            int top=stack.pop();
            insertAtBottom(stack,element);
            stack.push(top);
    }

}
