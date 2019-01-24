package algorithm.found;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @Author: evilhex
 * @Date: 2018-12-22 17:28
 */
public class BubbleSort {

    public static void Bubblesort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 1, 9};
        Bubblesort(arr);
        Arrays.stream(arr).forEach(value -> System.out.println(value));
    }
}
