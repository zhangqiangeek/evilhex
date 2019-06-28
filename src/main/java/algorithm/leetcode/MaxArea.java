package algorithm.leetcode;

/**
 * 11 Container with Most water
 *
 * @Author: evilhex
 * @Date: 2019-05-22 17:53
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high) {
            max = Math.max(max, (high - low) * (height[low] < height[high] ? height[low] : height[high]));
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }

        }
        return max;
    }
}
