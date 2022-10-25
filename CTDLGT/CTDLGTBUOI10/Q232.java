package CTDLGTBUOI10;

import java.util.Stack;

public class Q232 {
    public Stack<Integer> input = new Stack<>();
    public Stack<Integer> output = new Stack<>();

    public void push (int x){
        input.push(x);
    }

    public int pop(){
        if(output.isEmpty()){
            shiftStacks();
        }
        return output.pop();
    }

    public int peek(){
        if(output.isEmpty()){
            shiftStacks();
        }
        return output.peek();
    }

    public boolean empty(){
        return input.isEmpty() && output.isEmpty();
    }

    public void shiftStacks(){
        while(!input.isEmpty()){
            int temp = input.pop();
            output.push(temp);
        }
    }
}
