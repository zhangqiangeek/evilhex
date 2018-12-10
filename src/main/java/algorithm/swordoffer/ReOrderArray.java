package algorithm.swordoffer;

/**
 * 调整数组，奇数在前，偶数在后，O(n)的时间复杂度
 *
 * @Author: evilhex
 * @Date: 2018-12-06 11:36
 */
public class ReOrderArray {
    // 不能保证相对次序一致
    public static void reOrderArray(int[] array) {
        int begin = 0;
        int end = array.length - 1;
        if (array != null) {
            while (begin < end) {
                // 偶数向后移动
                while ((begin < end) && ((array[begin] & 0x1) == 1)) {
                    ++begin;
                }
                // 奇数向前移动
                while ((begin < end) && ((array[end] & 0x1) != 1)) {
                    --end;
                }
                //交换奇数和偶数的位置
                if (begin < end) {
                    int temp;
                    temp = array[begin];
                    array[begin] = array[end];
                    array[end] = temp;
                }
            }
        }
    }

    // 保证相对顺序一致的算法,O(n2)的时间复杂度
    public static void reOrderArray1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 0x1) != 1) {
                int temp = array[i];
                int j = i;
                for (j = i; j < array.length-1; j++) {
                    array[j] = array[j + 1];
                }
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
