package CTDLGTBUOI10;

import java.util.LinkedList;
import java.util.Queue;

public class Q225 {
    Queue<Integer> queue = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        queue.add(x);
        int k = queue.size();
        for(int i = 0; i < k - 1; i++){
            Integer first = queue.remove();
            queue.add(first);
        }
    }
    
    public int pop() {
        return queue.remove();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
       return queue.isEmpty();
    }
}
