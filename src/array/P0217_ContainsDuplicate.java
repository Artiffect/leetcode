/*
 * Problem : 217. Contains Duplicate (Easy)
 * Link    : https://leetcode.com/problems/contains-duplicate/
 * Date    : 2026-11-24
 * Pattern : HashSet
 * Time    : O(n) | Space : O(n)
 * Runtime : 14 ms (Beats 91.78%) | Memory : 108.22 MB (Beats 29.47%)
 * Elapsed : -
 */
package array;

import java.util.HashSet;
import java.util.Set;

class P0217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}
