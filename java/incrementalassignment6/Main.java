class Node<E>{
    //Node class, used for creating nodes
    Node<E> next;
    E data;
    public Node(E data){
        this.data = data;
    }
}

class SList<E> {
    //Slist class for creating a Singly linked list
    Node<E> head;


    public String toString(){
        //returns the elements of list as strings
        Node<E> current = head;
        //System.out.print("[");
        String str = "";
        while(current != null){
            str += current.data.toString() + " ";
            current = current.next;
        }
        return str;
    }
    public SListIterator<E> iterator(){
        //this method will create a object of SListIterator
        return new SListIterator<>(head, this);

    }
}


class SListIterator<E>{
    //SListIterator class, it is used to add and remove objects from Slist
    private Node<E> head;
    private SList<E> s1;
    SListIterator(Node<E> head, SList<E> s){
        //passing SList into generator method so that slist can be updated after adding or removing
        this.head = head;
        this.s1 = s;
    }
    public void add(E data){
        //this method adds data at the end of the Slist
        if (head == null) {//if head is not there, create a head
            head = new Node<E>(data);
            s1.head = head;
            return;
        }
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(data);
    }

    public void remove(E data){
        //this will remove a particular given data from the Slist
        if (head == null) return;
        if (head.data.equals(data)) {
            head = head.next;
            s1.head = head;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
public class Main{
    public static void main(String[] args){
        SList<Integer> s1 = new SList<>();
        SListIterator<Integer> itr1 = s1.iterator();
        itr1.add(5);
        itr1.add(6);
        //itr1.remove(5);
        System.out.println(s1);
        SList<String> s2 = new SList<>();
        SListIterator<String> itr2 = s2.iterator();
        itr2.add("A");
        itr2.add("B");
        itr2.add("C");
        System.out.println(s2);
        itr2.remove("B");
        System.out.println(s2);
        SList<Double> s3 = new SList<>();
        SListIterator<Double> itr3 = s3.iterator();
        itr3.add(0.2);
        itr3.add(0.9);
        System.out.println(s3);
    }
}
