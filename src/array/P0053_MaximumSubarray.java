/*
 * Problem : 53. Maximum Subarray (Medium)
 * Link    : https://leetcode.com/problems/maximum-subarray/
 * Date    : 2026-11-25
 * Pattern : DP / Kadane's Algorithm
 * Time    : O(n) | Space : O(1)
 * Runtime : 1 ms (Beats 100.00%) | Memory : 76.65 MB (Beats 78.33%)
 * Elapsed : -
 */
package array;

class P0053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
}
