package algorithm.found;

/**
 * 堆排序：不稳定，时间复杂度log(n)，空间复杂度 o(1)
 * 1、http://blog.51cto.com/flyingcat2013/1283090
 * 2、参考《算法》中算法描述
 *
 * @author evilhex.
 * @date 2018/7/26 上午11:27.
 */
public class HeapSort<T extends Comparable<T>> {

    // 指针0位置不存储数据
    private T[] nums;

    public void sort(T[] nums) {
        int N = nums.length - 1;
        for (int k = N / 2; k >= 1; k--) {
            sink(nums, k, N);
        }
        while (N > 1) {
            swap(nums, 1, N--);
            sink(nums, 1, N);
        }
    }


    private void sink(T[] nums, int k, int N) {
        while (k * 2 <= N) {
            int j = k * 2;
            if (j < N && less(nums, j, j + 1)) j++;
            if (!less(nums, k, j)) break;
            swap(nums, k, j);
            k = j;
        }
    }

    private boolean less(T[] nums, int i, int j) {
        return nums[i].compareTo(nums[j]) < 0;
    }

    private void swap(T[] nums, int i, int j) {
        T t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 3, 51, 7, 91, 10};
        HeapSort<Integer> sort = new HeapSort<>();
        sort.sort(nums);
        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }
}
