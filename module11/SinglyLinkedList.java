package com.tripillar_coding_assignment.module11;


public class SinglyLinkedList {
    SinglyLinkedList.Node head;//Starting node of the list -> only access point
    private int size;
    SinglyLinkedList(){
        size=0; //Initially list is empty ,so size is zero.
    }
    public class Node {
        String data; //The data of the node-> String type
        SinglyLinkedList.Node next;//address of the next node-> Node type
        Node(String data){
            this.data=data;
            this.next=null;//Initially node is connected to null
            size++;//Increment the size as a node is created
        }
    }
    public  void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=this.head.next;
        size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            size--;//One node deleted
            return;
        }
        Node secondLast=head;
        Node Last=head.next;
        while(Last.next!=null){
            secondLast=Last;
            Last=Last.next;
        }
        secondLast.next=null;
        //Last Node will be cleared by JVM
        size--;
    }
    public void deleteTargetNode(String target){
        //Empty List cannot remove target
        if(head==null){
            System.out.println("Empty list.Can't remove tail");
            return;
        }
        //Case where target is head node
        if(head.data.equals(target)){
            head=head.next;//Move the head to next node
            size--;
            return;
        }
        //Case where target is anywhere else in the list
        Node previous=null;
        Node current=head;
        while(current!=null&&!current.data.equals(target)){
            previous=current;
            current=current.next;
        }
        if(current==null){
            System.out.println("Target not found");
        }
        previous.next = current.next;
        size--;
    }
    public int countNodes(Node head){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.addFirst("Akash");
        sll.addLast("is");
        sll.addLast("Learning Programming");
        System.out.println(sll.countNodes(sll.head));
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.deleteTargetNode("is");
        sll.printList();
    }
}
