package algorithm.found;

/**
 * 三色排序问题
 *
 * @author evilhex.
 * @date 2018/8/1 上午10:16.
 */
public class ThreeColor {
    public int[] sortThreeColor(int[] A, int n) {
        int zeroIndex = -1;
        int twoIndex = A.length;
        int i = 0;
        while (i < twoIndex) {
            if (A[i] == 0) {
                swap(A, i, ++zeroIndex);
                i++;
            } else if (A[i] == 2) {
                swap(A, i, --twoIndex);
            } else {
                i++;
            }
        }
        return A;
    }

    private void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
