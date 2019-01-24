package algorithm.found;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @Author: evilhex
 * @Date: 2018-12-22 17:41
 */
public class InsertSort {

    public static void InsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int position = i;
            int value = array[i];
            while (position > 0 && array[position] < value) {
                array[position] = array[position - 1];
                --position;
            }
            array[position] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 1, 9};
        InsertSort(arr);
        Arrays.stream(arr).forEach(value -> System.out.println(value));
    }
}
