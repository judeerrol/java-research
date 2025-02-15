import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack (LIFO - Last In, First Out)
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Popping an element (Remove)
        System.out.println("Popped element: " + stack.pop());

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
