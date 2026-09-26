// Problem: Max Consecutive Ones
// Link: https://leetcode.com/problems/max-consecutive-ones/description/
// Difficulty: Easy
// Approach:
// - Keep track of the current consecutive count of 1s.
// - If the current number is 1, increment the count.
// - If the current number is 0, reset the count to 0.
// - Keep track of the maximum count seen so far.
// - Time Complexity: O(n)
// - Space Complexity: O(1)

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:
//
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s.
// The maximum number of consecutive 1s is 3.
//
// Example 2:
//
// Input: nums = [1,0,1,1,0,1]
// Output: 2

// Constraints:
//
// 1 <= nums.length <= 10^5
// nums[i] is either 0 or 1.

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i : nums) {
            count = (i == 0) ? 0 : count + 1;

            if (max < count) {
                max = count;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 1, 0, 1};

        MaxConsecutiveOnes mx = new MaxConsecutiveOnes();

        System.out.println(mx.findMaxConsecutiveOnes(nums));
    }
}
