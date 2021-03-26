package SuanfaLianxi;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/4 14:13
 */
class MinStack {
    Stack dataStack;
    Stack minStack;


    public MinStack() {
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        dataStack.push(x);

        if (minStack.size()==0 || x < (int) minStack.peek())
            minStack.push(x);
        else
            minStack.push((int)minStack.peek());
    }

    public void pop() {
        this.dataStack.pop();
        this.minStack.pop();
    }

    public int top() {
        return (int) this.dataStack.peek();
    }

    public int min() {
        return (int) minStack.peek();
    }
}

class Test {
    public static void main(String[] args) {
//        MinStack obj = new MinStack();
//        obj.push(5);
//        obj.pop();
//        int param_3 = obj.top();
//        int param_4 = obj.min();
    }
}
