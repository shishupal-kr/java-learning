package DSA.Stack;

public class Stack_lin {
    //Node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    static Node head = null;

    //check for empty list
    public static boolean isEmpty(){
        return head == null;
    }

    //push
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //pop
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    //peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Stack_lin s = new Stack_lin();
        s.push(3);
        s.push(2);
        s.push(1);

        while(!isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
