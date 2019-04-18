package algorithm.swordoffer.bak;

/**
 * 连续子数组最大和:利用规律和动态规划算法
 *
 * @Author: evilhex
 * @Date: 2018-12-17 10:53
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int cur = 0;
        int result = 0x80000000;
        for (int i = 0; i < array.length; i++) {

            if (cur < 0) {
                cur = array[i];
            } else {
                cur = cur + array[i];
            }
            if (cur > result) {
                result = cur;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 10, -4, 7, 2, -5};

    }
}
