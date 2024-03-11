package _001_Stack;
import java.util.Stack;
public class StackFunc {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // Push 연산
            stack.push(1);
            stack.push(2);
            stack.push(3);

            // Pop 연산
            while (!stack.isEmpty()) {
                System.out.println(stack.pop() + " Popped!");
            }
        }
}
