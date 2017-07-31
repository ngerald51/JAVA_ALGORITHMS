public class Queue {
    private int maxSize; //Init set no of slots
    private long[] queArray; // slots to maintain the data
    private int front; // Index position for element in the front
    private int rear; //Index position at the back
    private int nItems; // Counter to maintain the no of items in que

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; //element infront of que
        rear = -1; //no item in the arrary yet to be considered
        nItems = 0; //No elements in arrary

    }

    void insert(long j) {
        if (rear == maxSize - 1) {
            rear = -1; //override  element if que is full
        }
        rear++;
        queArray[rear] = j;
        nItems++;

    }

    long remove() {
        //remove item from front of que
        long temp = queArray[front];
        front++;
        if (front == maxSize) {
            front = 0; //set front to 0th index so can utilize que again
        }
        nItems--;
        return temp;
    }

    long peekFront() {
        return queArray[front];
    }

    boolean isEmpty() {
        return (nItems == 0);
    }

    boolean isFull() {
        return (nItems == maxSize);
    }

    void view() {
        System.out.println("[");
        for (int i = 0; i < queArray.length; i++) {
            System.out.println(queArray[i] + " ");

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(10);
        myQueue.insert(12);
        myQueue.insert(13);
        myQueue.insert(55);
        myQueue.insert(123);
        myQueue.insert(122);

        myQueue.view();
    }

}
