package dsdefaultprograms.linkedlist;

import java.util.LinkedList;

public class SinglyLinkedList {

    Node first;
    Node last;
    int size = 0;

    public void add(int data) {
        linkLast(data);
    }

    public void addDataUsingIndex(int data, int location) {
        var n = new Node();
        n.data = data;
        if (first == null) {
            linkLast(data);
            return;
        } else if (location == 0) {
            linkFirst(data);
            return;
        } else if (location >= size) {
            linkLast(data);
            return;
        } else {
            Node thead = first;
            int index = 0;
            while (index < location - 1) {
                thead = thead.next;
                index++;
            }
            Node lastNode = thead.next;
            thead.next = n;
            n.next = lastNode;
        }

        size++;
    }


    public void linkFirst(int data) {
        var n = new Node();
        n.data = data;
        n.next = null;
        if (first == null) {
            first = n;
            last = n;
        } else {
            Node last = first;
            first = n;
            first.next = last;

        }
        size++;
    }

    public void linkLast(int data) {
        var n = new Node();
        n.data = data;
        n.next = null;
        if (first == null) {
            first = n;
            last = n;
        } else {
            Node nextNode = first;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            nextNode.next = n;
            last = nextNode;
        }
        size++;
    }

    void print() {
        Node thead = first;
        while (thead != null) {
            System.out.println(thead.data);
            thead = thead.next;
        }
    }

    Node search(int data) {
        Node thead = first;
        if (thead.data == data) {
            return thead;
        } else {
            Node lastNode = thead.next;
            while (lastNode != null) {
                if (lastNode.data == data) {
                    return lastNode;
                }
                lastNode = lastNode.next;
            }
        }
        return null;
    }

    void traverseSinglyList() {
        if (first == null) {
            System.out.println("Node does not exist");
        } else {
            Node thead = first;
            for(var i=0;i<size;i++){
                System.out.print(thead.data);
                if(i!=size-1){
                    System.out.print("->");
                }
                thead = thead.next;

            }
        }

    }


    public void delete(int data) {
        if (first.data == data) {
            first = first.next;
        } else {
            Node lastNode = first;
            while (lastNode.next != null) {
                if (lastNode.next.data == data) {
                    lastNode.next = lastNode.next.next;
                    return;
                }
                lastNode = lastNode.next;
            }
        }
        size --;
    }

    public void deletionOfNode(int location) {
        if (first == null) {
            System.out.println("The SLL does not exist");
            return;
        } else if (location == 0) {
            first = first.next;
            size--;
            if (size == 0) {
                last = null;
            }
        } else if (location >= size) {
            Node tempNode = first;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == first) {
                last = last = null;
                size--;
                return;
            }
            tempNode.next = null;
            last = tempNode;
            size--;
        } else {
            Node tempNode = first;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.linkFirst(4);
        singlyLinkedList.addDataUsingIndex(10, 2);
//        singlyLinkedList.print();
//        Node node = singlyLinkedList.search(10);
//        if(node!=null){
//            System.out.println(node.data);
//        }
//        singlyLinkedList.deletionOfNode(3);
        singlyLinkedList.traverseSinglyList();

    }


}
