package algorithm.swordoffer;

/**
 * @Author: evilhex
 * @Date: 2018-12-18 11:06
 */
public class FindNumsAppearOnce {

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null) {
            return;
        }
        int result = 0;
        int flag = 1;
        for (int i = 0; i < array.length; i++) {
            result = result ^ array[i];
        }
        while ((result & flag) == 0) flag <<= 1;

        for (int i = 0; i < array.length; ++i) {
            if ((flag & array[i]) == 0) {
                num2[0] ^= array[i];
            } else {
                num1[0] ^= array[i];
            }
        }
    }
}
