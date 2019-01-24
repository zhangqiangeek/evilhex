package algorithm.found;

import java.util.Arrays;

/**
 * @Author: evilhex
 * @Date: 2018-12-22 17:35
 */
public class SelectSort {
    public static void SelectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int value = array[i];
            int min = i;
            for (int j = i; j < array.length ; j++) {
                if (array[j] < value) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 1, 9};
        SelectSort(arr);
        Arrays.stream(arr).forEach(value -> System.out.println(value));
    }
}
