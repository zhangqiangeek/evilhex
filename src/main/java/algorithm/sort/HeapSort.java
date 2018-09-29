package algorithm.sort;

import java.util.Arrays;

/**
 * 堆排序：不稳定，时间复杂度log(n)，空间复杂度 o(1)
 * http://blog.51cto.com/flyingcat2013/1283090
 *
 * @author evilhex.
 * @date 2018/7/26 上午11:27.
 */
public class HeapSort {
    private int[] array;

    public HeapSort(int[] array) {
        this.array = array;
    }

    /**
     * 获取父节点
     *
     * @param child
     * @return
     */
    private int getParentIndex(int child) {
        return (child - 1) / 2;
    }

    /**
     * 获取左孩子节点
     *
     * @param parent
     * @return
     */
    private int getLeftChildIndex(int parent) {
        return 2 * parent + 1;
    }

    /**
     * 堆排序
     */
    public void sort() {
        initHeap();
        int last = array.length - 1;
        while (last > 0) {
            swap(0, last);
            last--;
            if (last > 0) {
                adjustHeap(last);
            }
        }
    }

    /**
     * 初始化一个大根堆
     */
    private void initHeap() {
        int last = array.length - 1;
        for (int i = getParentIndex(last); i >= 0; --i) {
            int k = i;
            int j = getLeftChildIndex(k);
            while (j < last) {
                if (j < last) {
                    //如果左子树小于右子树，j就指向右子树
                    if (array[j] <= array[j + 1]) {
                        j++;
                    }
                }
                if (array[k] > array[j]) {
                    break;
                } else {
                    swap(k, j);
                    //继续筛选子树
                    k = j;
                }
                j = getLeftChildIndex(k);
            }
        }
    }

    /**
     * 调整堆
     *
     * @param lastIndex
     */
    public void adjustHeap(int lastIndex) {
        int k = 0;
        while (k <= getParentIndex(lastIndex)) {
            int j = getLeftChildIndex(k);
            if (j < lastIndex) {
                if (array[j] < array[j + 1]) {
                    j++;
                }
            }
            if (array[k] < array[j]) {
                swap(k, j);
                k = j;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 2, 1, 5, 3, 6, 1001, 5, 1000, 7, 8, 9, 4, 5, 5, 5, 7 };
        HeapSort heapSort = new HeapSort(array);
        heapSort.sort();
        Arrays.stream(array).forEach(val -> System.out.println(val));
    }
}
