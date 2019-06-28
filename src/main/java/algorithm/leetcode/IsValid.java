package algorithm.leetcode;

import java.util.Stack;

/**
 * 括号匹配问题
 *
 * @Author: evilhex
 * @Date: 2019-05-13 09:26
 */
public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
