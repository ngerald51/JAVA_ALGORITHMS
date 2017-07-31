package ds.singlyLinkedList;

public class CircularList {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public int deleteFirst() {
        int temp = first.data;

        if (first.next == null) {
            last = null;
        }
        first = first.next; // first will point to old's new value
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public static void main (String args[])
    {
        CircularList myList = new CircularList();
        myList.insertFirst(2);
        myList.insertFirst(3);
        myList.insertFirst(7);
        myList.insertFirst(10);
        myList.insertFirst(200);
        myList.insertLast(2234445);

        myList.displayList();
    }

}
