package dsdefaultprograms.linkedlist;

public class Node {
    int data;
    Node next;

    Node prev;


    public Node() {
    }

    public Node(int data,Node head) {
        this.data = data;
        this.next = head;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }


}
