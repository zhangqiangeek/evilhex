package algorithm.swordoffer;

import java.util.ArrayList;

/**
 * 获取数组中最小的K个数字
 *
 * @Author: evilhex
 * @Date: 2018-12-17 10:25
 */
public class GetLeastNumbers {

    static public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 初始条件的判断注意最后一种情况
        if (input == null || input.length <= 0 || k <= 0 || k > input.length) {
            return arrayList;
        }
        int start = 0;
        int end = input.length - 1;
        int index = partition(input, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                end = index - 1;
                index = partition(input, start, end);
            } else {
                start = index + 1;
                index = partition(input, start, end);
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
            System.out.println(input[i]);
        }

        return arrayList;
    }

    // 快排中划分函数
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
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        GetLeastNumbers_Solution(arr, 5);
    }
}
