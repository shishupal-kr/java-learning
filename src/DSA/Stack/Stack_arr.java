package DSA.Stack;
import java.util.ArrayList;

class Stack_arr {
    static ArrayList<Integer> list = new ArrayList<>();

    // Check if stack is empty
    static boolean isEmpty() {
        return list.isEmpty();
    }

    //push
   static void push(int data){
       list.add(data);
   }

   //peek
    static int peek(){
       return list.get(list.size() -1);
    }

    //pop
    static int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return-1;
        }

        int top = list.get(list.size() -1);
        list.remove(list.size() - 1);
        return top;
    }

    public static void main(String[] args) {

        //push
        push(4);
        push(3);
        push(2);
        push(1);

        //printing
        while(!isEmpty()) {
            System.out.println(peek());
            pop();
        }

    }
}
