package ds.singlyLinkedList;

public class SinglyNode {
    public int data;
    public SinglyNode next;
    private Node first;


    public SinglyNode (){

    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=first;
        first= newNode;
    }

    public Node deleteFirst(){
        Node temp= first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null){
            current.displayNode();
            current= current.next;
        }
        System.out.println();
    }

    public void displayNode(){
        System.out.println("{ " + data +" }");
    }

    public void insertLast(int data){
        Node current = first;
        while (current.next != null){
            current= current.next;
        }
        Node newNode= new Node();
        newNode.data = data;

        current.next=newNode;
    }

    public static void main (String args[]){
        SinglyNode  myList= new SinglyNode();
        myList.insertFirst(2);
        myList.insertFirst(3);
        myList.insertFirst(7);
        myList.insertFirst(10);
        myList.insertFirst(200);
        myList.insertLast(2234445);

        myList.displayList();
    }

}
