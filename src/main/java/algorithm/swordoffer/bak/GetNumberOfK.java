package algorithm.swordoffer.bak;

/**
 * 数字在排序数组中出现的次数：二分查找的思想
 *
 * @Author: evilhex
 * @Date: 2018-12-18 10:23
 */
public class GetNumberOfK {
    public int GetNumberOfK(int[] array, int key) {
        if (array == null || array.length == 0)
            return 0;
        int length = array.length;
        if (key < array[0] || key > array[length - 1])
            return 0;
        int first = GetFirstKey(array, key, length, 0, length - 1);
        int last = GetLastKey(array, key, length, 0, length - 1);
        if (first == last && array.length != 1)
            return 0;

        else
            return last - first + 1;

    }

    static int GetFirstKey(int[] array, int key, int length, int start, int end) {
        if (start > end)
            return -1;
        int middleIndex = (start + end) / 2;
        int middleData = array[middleIndex];
        if (middleData == key) {
            if ((middleIndex > 0 && array[middleIndex - 1] != key) || middleIndex == 0)
                return middleIndex;
            else end = middleIndex - 1;
        } else if (middleData > key)
            end = middleIndex - 1;
        else start = middleIndex + 1;
        return GetFirstKey(array, key, length, start, end);
    }

    static int GetLastKey(int[] array, int key, int length, int start, int end) {
        if (start > end)
            return -1;
        int middleIndex = (start + end) / 2;
        int middleData = array[middleIndex];
        if (middleData == key) {
            if ((middleIndex < (length - 1) && array[middleIndex + 1] != key) || middleIndex == length - 1)
                return middleIndex;
            else start = middleIndex + 1;
        } else if (middleData > key)
            end = middleIndex - 1;
        else start = middleIndex + 1;
        return GetLastKey(array, key, length, start, end);
    }
}
