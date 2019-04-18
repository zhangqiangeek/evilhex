package algorithm.swordoffer.bak;

import java.util.Stack;

/**
 * 栈和队列的相互实现
 *
 * @Author: evilhex
 * @Date: 2018-12-04 10:57
 */
public class StackAndQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        // 出栈：2不空，就把1中的全部压入2中，取出2中顶端
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
