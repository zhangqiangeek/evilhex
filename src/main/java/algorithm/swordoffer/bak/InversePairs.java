package algorithm.swordoffer.bak;

/**
 * @Author: evilhex
 * @Date: 2018-12-17 16:23
 */
public class InversePairs {

    // 这种方案超时
    static public int InversePairs(int[] array) {
        if (array == null || array.length <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(InversePairs(arr));
    }
}
