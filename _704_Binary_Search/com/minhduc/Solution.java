package com.minhduc;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index.
 * Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -104 < nums[i], target < 104
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 */

public class Solution {
    private int i;

    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int pivot = (i + j) / 2;
            if (nums[pivot] == target) return pivot;
            if (nums[pivot] < target) {
                i = pivot + 1;
            } else {
                j = pivot - 1;
            }
        }
        return -1;
    }
}
