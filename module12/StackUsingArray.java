package com.tripillar_coding_assignment.module12;

public class StackUsingArray {
    private static final int MAX_SIZE=10;
    private String[] arr = new String[MAX_SIZE];
    private int top = -1;//Initially the stack is empty
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }
    public void push(String s){
        if(isFull()){
            System.out.println("Stack is full .Can't add elements");
            return;
        }
        arr[++top]=s;
        System.out.println("The String "+s+" has been added to Stack");
    }
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is empty .Can't remove elements");
            return null;
        }
        String popped=arr[top--];
        return popped;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.Can't display elements");
            return;
        }
        System.out.println("the stack elements from top to bottom (LIFO):");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public String peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow.No top elements");
            return null;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        StackUsingArray sua=new StackUsingArray();
        sua.push("1");
        sua.push("2");
        sua.push("3");
        sua.push("4");
        sua.push("5");
        sua.display();
        System.out.println(sua.pop());
        System.out.println(sua.peek());
    }
}
