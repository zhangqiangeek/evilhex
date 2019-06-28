package algorithm.zuo;

import java.util.Stack;

/**
 * 只允许申请一个栈对另一个栈操作排序
 *
 * @Author: evilhex
 * @Date: 2019-05-21 14:45
 */
public class SortStackByStack {
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && cur < help.peek()) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
    }
}
