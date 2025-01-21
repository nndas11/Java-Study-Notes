package CustomStack;

import CustomStack.CustomStack;

public class MainStack {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
