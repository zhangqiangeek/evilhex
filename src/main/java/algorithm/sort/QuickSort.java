package algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author evilhex.
 * @date 2018/7/26 上午10:50.
 */
public class QuickSort {
    public static void quickSort(int[] arr) {
        qsort(arr, 0, arr.length - 1);
    }

    public static void qsort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            qsort(arr, low, pivot - 1);
            qsort(arr, pivot + 1, high);
        }
    }

    /**
     * 以pivot为数轴，划分数组
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                --high;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) {
                ++low;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        int[]  a={1,2,3,4,7,2,10,8,9,1,3};
        quickSort(a);
        Arrays.stream(a).forEach(x-> System.out.println(x));
    }
}
