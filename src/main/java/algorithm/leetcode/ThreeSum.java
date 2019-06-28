package algorithm.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: evilhex
 * @Date: 2019-05-22 18:51
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int curSum = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                
            }
        }
        return res;
    }

}
