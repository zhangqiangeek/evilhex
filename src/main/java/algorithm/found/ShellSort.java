package algorithm.found;


/**
 * 希尔排序
 *
 * @Author: evilhex
 * @Date: 2019-04-08 13:59
 */
public class ShellSort extends Sort {
    public static void main(String[] args) {
        Integer[] a = {2, 3, 6, 7, 9, 2, 1, 5, 5, 6, 7, 8, 8, 9, 9, 9, 0, 0, 0, 3, 3, 4, 3, 43, 4, 3, 5, 6, 5, 7, 7, 7, 5, 75, 7, 5,};
        ShellSort shellSort = new ShellSort();
        shellSort.sort(a);
        for (int temp : a) {
            System.out.print(temp + " ");
        }
    }

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;
        }
        // 控制步长
        while (h >= 1) {
            System.out.println("当前步长：" + h);
            // 把数组变为有序
            for (int i = h; i < N; i++) {
                // h间隔大小插入排序
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    //swap a[j] a[j-h]
                    swap(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
