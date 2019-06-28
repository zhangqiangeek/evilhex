package algorithm.zuo;

import java.util.Stack;

/**
 * 实现一个特殊的栈，在实现栈基本功能的基础上，再实现返回栈中最小元素的操作 pop push getMin 时间复杂度都是O(1)
 *
 * @Author: evilhex
 * @Date: 2019-05-21 11:04
 */
public class MyStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(Integer newNum) {
        stackData.push(newNum);
        if (stackMin.peek() < newNum) {
            stackMin.push(stackMin.peek());
        } else {
            stackMin.push(newNum);
        }
    }

    public Integer pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        int value = stackData.pop();
        stackMin.pop();
        return value;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        return stackMin.peek();
    }
}
