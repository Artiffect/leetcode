/*
 * Problem : 238. Product of Array Except Self (Medium)
 * Link    : https://leetcode.com/problems/product-of-array-except-self/
 * Date    : 2026-11-24
 * Pattern : Prefix / Suffix Product
 * Time    : O(n) | Space : O(1) (출력 배열 제외)
 * Runtime : 2 ms (Beats 93.69%) | Memory : 71.32 MB (Beats 64.61%)
 * Elapsed : -
 */
package array;

class P0238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}
