package algorithm.found;

import java.util.Arrays;

/**
 * 合并两个有序数组，结果保存到其中一个数组中
 *
 * @author evilhex.
 * @date 2018/7/27 上午11:19.
 */
public class MergeArray {
    public static int[] mergeAB(int[] A, int[] B, int n, int m) {
        int aIndex = n - 1;
        int bIndex = m - 1;
        int aLast = n + m - 1;
        while (bIndex >= 0 && aIndex >= 0) {
            A[aLast--] = A[aIndex] > B[bIndex] ? A[aIndex--] : B[bIndex--];
        }
        while (bIndex>=0){
            A[aLast--]=B[bIndex--];
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 0, 0, 0 };
        int[] B = { 1, 2, 3 };
        mergeAB(A, B, 3, 3);
        Arrays.stream(A).forEach(X -> System.out.println(X));
    }
}
