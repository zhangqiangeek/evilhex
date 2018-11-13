package algorithm.swordoffer;

/**
 * 二位数组中的查找,nowcoder通过测试
 *
 * @author evilhex.
 * @date 2018/11/13 11:18 AM.
 */
public class FindInMatrix {
    public boolean Find(int target, int[][] array) {
        boolean found = false;
        if (array != null) {
            int row = array.length;
            int column = array[0].length;
            if (row > 0 && column > 0) {
                //从右上角开始查找
                int n = 0;
                int m = column - 1;
                while (n < row && m >= 0) {
                    if (target == array[n][m]) {
                        found = true;
                        break;
                    } else if (target > array[n][m]) {
                        n++;
                    } else {
                        m--;
                    }
                }
            }
        }
        return found;
    }
}
