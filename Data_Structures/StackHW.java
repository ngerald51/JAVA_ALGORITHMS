public class StackHW {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackHW(int size){
        this.maxSize=size;
        this.stackArray= new char[maxSize];
        this.top = -1;

    }

    private void push(char i) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            stackArray[top] = i;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty");
            return '0';
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public char peak()
    {
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize-1 ==  top);
    }

    public static void main (String[] args)
    {
        System.out.println(reverseSTR("Hello"));

    }

    public static String reverseSTR(String s)
    {
        String result="";
        StackHW strStack =new StackHW(s.length());
       for (int i=0; i< s.length(); i++) {
           strStack.push(s.charAt(i));
       }

        while (!strStack.isEmpty()){
            char value = strStack.pop();
            result += value;
        }


        return result;

    }
}
