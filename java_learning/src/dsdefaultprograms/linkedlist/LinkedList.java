package dsdefaultprograms.linkedlist;


public class LinkedList {

    Node head;

    public void add(int data) {
        var n = new Node(data,head);
        head = n;
    }

    public void addLast(int data){
        var n = new Node();
        n.data= data;
        n.next=null;
        if(head==null){
            head = n;
        }else{
            var lastNode = head;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = n;
        }
    }

    public void print() {
        Node tHead = head;
        while (tHead != null) {
            System.out.println(tHead.data);
            tHead = tHead.next;
        }
    }

    public boolean search(int data){
        if(head.data==data){
            return true;
        }else{
            Node searchData = head.next;
            while (searchData!=null){
                if(data==searchData.data){
                    return true;
                }
                searchData = searchData.next;
            }
        }
        return false;
    }

    public void deleteKey(int deleteKey){
        if(head.data==deleteKey){
            head = head.next;
        }else{
            var deleteNode = head.next;
            while(deleteNode!=null){
                if(deleteNode.data==deleteKey){
                    deleteNode = deleteNode.next;
                }
                deleteNode = deleteNode.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addLast(1);
        l.addLast(2);
        l.add(4);
        l.addLast(3);
        l.deleteKey(4);
        l.add(5);
        l.print();
    }
}
