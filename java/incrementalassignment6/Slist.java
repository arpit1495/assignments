/*
class Node{
    Node next;
    int data;
    public Node(int data){
        this.data = data;
    }


}
public class Slist {
    Node head;
/*
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    */
/*
    public SListIterator iterator(){
        SListIterator itr = new SListIterator();
        return itr;

    }
}

class SListIterator{
    public void add(int data){
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void remove(int data){
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
public class Main{
    public static void main(String[] args){
        Slist s1 = new Slist();
        SListIterator itr1 = s1.iterator();
        itr1.add(5);
        itr1.add(6);

    }
}*/