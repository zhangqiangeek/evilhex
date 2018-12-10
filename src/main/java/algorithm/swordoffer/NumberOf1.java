package algorithm.swordoffer;

/**
 * 位运算：判断整数中1的个数
 *
 * @Author: evilhex
 * @Date: 2018-12-05 11:15
 */
public class NumberOf1 {

    // 如果为负数就会产生死循环，负数高位为1
    public static int NumberOf1(int n) {
        int num = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                num++;
            }
            n = n >> 1;
        }
        return num;
    }

    // 第二种解法：左移flag，32次循环
    public static int NumberOf2(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) == flag)
                count++;
            flag = flag << 1;
        }
        return count;
    }

    //第三种解法：
    public static int NumberOf3(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(15));
    }
}
