package algorithm.swordoffer;

/**
 * @Author: evilhex
 * @Date: 2019-04-09 11:17
 */
public class Find {
    public boolean Find(int target, int[][] array) {
        // 行
        int rows = array.length;
        // 列
        int cols = array[0].length;
        int m = 0;
        int n = cols - 1;
        while (m < rows && cols >= 0) {
            if (array[m][n] == target) {
                return true;
            } else if (array[m][n] < target) {
                m++;
            } else {
                n--;
            }
        }
        return false;
    }
}
