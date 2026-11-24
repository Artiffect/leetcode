/*
 * Problem : 1. Two Sum (Easy)
 * Link    : https://leetcode.com/problems/two-sum/
 * Date    : 2026-11-24
 * Pattern : HashMap (1-Pass)
 * Time    : O(n) | Space : O(n)
 * Runtime : 3 ms (Beats 59.79%) | Memory : 46.76 MB (Beats 53.04%)
 * Elapsed : -
 */
package array;

import java.util.HashMap;
import java.util.Map;

class P0001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            Integer idx = map.get(need);
            if (idx != null) {
                return new int[] {idx, i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
