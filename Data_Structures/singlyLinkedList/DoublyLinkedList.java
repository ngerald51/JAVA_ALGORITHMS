package ds.singlyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;

    }

    public boolean isEmpty() {
        return first == null;
    }

    void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;

        }
        newNode.next = first;
        this.first = newNode;

    }

    void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode; //assignment of
            newNode.previous = last;
        }

        this.last = newNode;
    }

    //assume non-empty list
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next; // assigning the reference of the node ollowing of the old first node
        return temp; // return the delete old first node
    }

    Node deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    boolean insertAfter(int key, int data) {
        Node current = first; //start from begining of the list
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;

        if (current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;

        return true;
    }

    Node deleteKey(int key) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    void displayForward() {
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    void displayBackward() {
        System.out.println("List (last --> first)");
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(22);
        theList.insertFirst(33);
        theList.insertLast(24);
        theList.deleteKey(22);
        theList.displayForward();
    }

}
