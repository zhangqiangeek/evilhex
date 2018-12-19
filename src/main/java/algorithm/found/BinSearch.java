package algorithm.found;

/**
 * 二分查找
 *
 * @Author: evilhex
 * @Date: 2018-12-18 10:33
 */
public class BinSearch {

    static int BinSearch(int[] array, int k) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        return BinSearchInArray(array, start, end, k);
    }

    static int BinSearchInArray(int[] array, int start, int end, int k) {
        int middle = (start + end) >> 1;
        if (array[middle] == k) {
            return middle;
        }
        if (start > end) {
            return -1;
        } else if (array[middle] > k) {
            return BinSearchInArray(array, start, --middle, k);
        } else {
            return BinSearchInArray(array, ++middle, end, k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(BinSearch(arr, 7));
    }
}
