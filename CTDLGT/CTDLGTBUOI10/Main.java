package CTDLGTBUOI10;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(9);
        stack.push(7);
        stack.push(8);
        System.out.println(stack);

        // for (int i = 0; i < stack.size(); i++){
        // System.out.println(stack.pop() + "\t");
        // }

        System.out.println("Phần tử đầu tiên: " + stack.pop());
        System.out.println(stack);
        System.out.println("Phần tử trên đỉnh: " + stack.peek());
        System.out.println(stack);
        System.out.println("Tìm kiếm: " + stack.search(-7));
    }
}
