/**Class: SplitStack
 * @author D Browner
 * @version 1.6
 * Course: ITEC 2140 Spring 2023
 * Written: April 18, 2024
 */
import java.util.Stack;

public class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        Stack<Integer> negatives = new Stack<>();
        Stack<Integer> nonNegatives = new Stack<>();

        //Split stack into negatives/non-negatives
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < 0) {
                negatives.push(num);
            } else {
                nonNegatives.push(num);
            }
        }

        //reassemble stack with negatives at bottom and non-negatives on top
        while (!negatives.isEmpty()) {
            stack.push(negatives.pop());
        }
        while (!nonNegatives.isEmpty()) {
            stack.push(nonNegatives.pop());
        }
    }

    public static void main(String[] args) {
        //test examples
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5); stack1.push(-5); stack1.push(67); stack1.push(-45); stack1.push(67);
        stack1.push(9); stack1.push(0); stack1.push(-42); stack1.push(56); stack1.push(-7);
        System.out.println("Before split: " + stack1);
        splitStack(stack1);
        System.out.println("After split: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1); stack2.push(-2); stack2.push(-3); stack2.push(4); stack2.push(-5);
        stack2.push(6); stack2.push(-7); stack2.push(8); stack2.push(9);
        System.out.println("Before split: " + stack2);
        splitStack(stack2);
        System.out.println("After split: " + stack2);
    }
}
