package algorithm.zuo;

import java.util.Stack;

/**
 * 仅仅使用递归函数和栈操作逆序一个栈
 *
 * @Author: evilhex
 * @Date: 2019-05-21 11:33
 */
public class reverse {
    /**
     * 返回并移除栈底元素
     *
     * @param stack
     * @return
     */
    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    /**
     * 递归实现方法
     *
     * @param stack
     */
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
}
