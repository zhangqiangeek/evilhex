package algorithm.leetcode;

/**
 * @Author: evilhex
 * @Date: 2019-04-11 21:02
 */
public class reverse {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int sign = 1;
        if (x < 0) {
            sign = -1;
        }
        long number = Math.abs((long) x), sum = 0;
        while (number != 0) {
            sum = sum * 10 + number % 10;
            number = number / 10;
        }

        if (sign * sum > Integer.MAX_VALUE || sign * sum < Integer.MIN_VALUE) {
            return 0;
        }
        return sign * (int) sum;
    }

    public static void main(String[] args) {
        reverse reverse = new reverse();
        int i = reverse.reverse(-2147483412);
        System.out.println(1534236469 > Integer.MAX_VALUE);
    }
}
