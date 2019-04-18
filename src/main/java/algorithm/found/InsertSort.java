package algorithm.found;

/**
 * 插入排序
 *
 * @Author: evilhex
 * @Date: 2018-12-22 17:41
 */
public class InsertSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(nums[j], nums[j - 1]); j--) {
                swap(nums, j, j - 1);
            }
        }
    }
}
