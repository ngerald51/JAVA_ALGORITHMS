package ds.singlyLinkedList;

public class Node {

    int data;
    Node next = null;
    Node previous = null;


    public static void main(String args[]) {
        Node nodeA = new Node();
        nodeA.data = 2;


        Node nodeB = new Node();
        nodeB.data = 4;


        Node nodeC = new Node();
        nodeC.data = 9;


        nodeA.next = nodeB;
        nodeB.next = nodeC;

        System.out.println(listLength(nodeB));

    }

    public static int listLength(Node aNode) {
        int length = 0;
        Node currentNode = aNode;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
    public void displayNode(){
        System.out.println("{ " + data +" }");
    }
}

