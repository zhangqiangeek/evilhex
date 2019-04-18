package algorithm.found;

/**
 * 选择排序
 *
 * @Author: evilhex
 * @Date: 2018-12-22 17:35
 */
public class SelectSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; i < n; j++) {
                if (less(nums[j], nums[min])) {
                    min = j;
                }
            }
            if (i != min) {
                swap(nums, i, min);
            }
        }
    }
}
