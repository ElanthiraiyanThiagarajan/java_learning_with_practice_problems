package dsdefaultprograms.linkedlist;

public class DoublyLinkedList {

    Node head = null;
    int size = 0;

    public void addLast(int data) {
        Node n = new Node();
        n.data = data;
        if (head == null) {
            head = n;
            head.next = null;
            head.prev = null;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = n;
            lastNode.prev = lastNode;
            n.next = null;
        }
        size++;
    }

    public void add(int data) {
        addLast(data);
    }

    public void traverDoublyListForward() {
        if (head == null) {
            System.out.println("Node does not exist");
        } else {
            Node thead = head;
            for (var i = 0; i < size; i++) {
                System.out.print(thead.data);
                if (1 != size - 1)
                    System.out.print("->");
                thead = thead.next;

            }
        }
    }

    public void traverDoublyListBackward() {
        if (head == null) {
            System.out.println("Node does not exist");
        } else {
            Node thead = head;
            for (var i = 0; i < size; i++) {
                System.out.print(thead.data);
                if (1 != size - 1)
                    System.out.print("->");
                thead = thead.next;

            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.add(1);
        d.add(2);

    }

}
