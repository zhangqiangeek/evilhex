package algorithm.swordoffer;

/**
 * 数组中只出现多于一半的数字
 *
 * @Author: evilhex
 * @Date: 2018-12-17 10:14
 */
public class MoreThanHalfNum {

    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int result = array[0];
        int time = 1;
        for (int i = 1; i < array.length; i++) {
            if (time == 0) {
                result = array[i];
                time = 1;
            } else if (result == array[i]) {
                time++;
            } else {
                time--;
            }
        }
        return result;
    }
}
