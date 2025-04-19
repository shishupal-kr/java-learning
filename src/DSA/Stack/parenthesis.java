package DSA.Stack;
import java.util.Stack;

public class parenthesis {

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // If it's an opening bracket, push to stack
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
           // If it's a closing bracket, check for matching opening bracket
                if(stack.isEmpty()){
                    return false;
                }
                // Check if the current closing matches the last opened
                if( (stack.peek() == '(' && ch == ')') ||
                    (stack.peek() == '{' && ch == '}') ||
                    (stack.peek() == '[' && ch == ']') ){
                    stack.pop();
                }else{ //if not matched it's invalid
                    return false;
                }
            }
        }
        // Return true if no unmatched opening brackets remain
        return stack.isEmpty();
    }

    public static boolean isDuplicate(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;

                // Pop until an opening bracket is found
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                if (!stack.isEmpty()) {
                    stack.pop(); // Pop the opening bracket
                }

                // If no characters between '()', it's a duplicate
                if (count == 0) {
                    return true;
                }

            } else {
                stack.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str  = "{[(]}}";
        System.out.println(isDuplicate(str));
    }
}
