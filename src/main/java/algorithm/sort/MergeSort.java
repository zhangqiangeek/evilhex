package algorithm.sort;

/**
 * 归并排序
 *
 * @author evilhex.
 * @date 2018/7/10 下午6:55.
 */
public class MergeSort {

    /**
     * 合并两个有序的数组
     *
     * @param a
     * @param b
     * @param c
     */
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }

    /**
     * 归并排序
     *
     * @param arr
     */
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        internalMergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void internalMergeSort(int[] a, int[] b, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            //处理左边
            internalMergeSort(a, b, left, middle);
            //处理右边
            internalMergeSort(a, b, middle + 1, right);
            //合并两个子数组
            mergeSortedArray(a, b, left, middle, right);
        }
    }

    /**
     * 合并两个有序子序列
     *
     * @param arr
     * @param temp
     * @param left
     * @param middle
     * @param right
     */
    private static void mergeSortedArray(int arr[], int temp[], int left, int middle, int right) {
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= middle) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        //把数据复制回原数组
        for (i = 0; i < k; ++i) {
            arr[left + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 2, 4, 5, 6 };
        int[] c = new int[7];
        merge(a, b, c);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
