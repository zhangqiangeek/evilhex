package algorithm.swordoffer;

/**
 * 旋转数组
 *
 * @Author: evilhex
 * @Date: 2018-12-04 11:18
 */
public class MinNumberInRotateArray {

    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length <= 0)
            return 0;
        int index1 = 0;
        int index2 = array.length - 1;
        int indexMid = index1;
        while (array[index1] >= array[index2]) {
            if ((index2 - index1) == 1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;
            // 特殊情况需要顺序查找，特殊处理
            if (array[index1] == array[index2] && array[index1] == array[indexMid])
                return MinInOrder(array, index1, index2);
            if (array[indexMid] >= array[index1])
                index1 = indexMid;
            else if (array[indexMid] <= array[index2])
                index2 = indexMid;
        }
        return array[indexMid];
    }

    private int MinInOrder(int[] array, int index1, int index2) {
        int result = array[index1];
        for (int i = index1 + 1; i <= index2; i++) {
            if (array[i] < result)
                result = array[i];
        }
        return result;
    }
}
