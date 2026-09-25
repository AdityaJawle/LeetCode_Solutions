// Problem: Concatenation of Array
// Link: https://leetcode.com/problems/concatenation-of-array/description/
// Difficulty: Easy
// Approach:
// - Create a new array of size 2n.
// - Copy each element of nums into the first half of the new array.
// - Copy each element of nums again into the second half.
// - Return the new array.

// Given an integer array nums of length n, create an array ans of length 2n
// where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n.
//
// In other words, ans is the concatenation of nums with itself.
//
// Return the array ans.

 

// Example 1:
//
// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed by concatenating nums with itself:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]

// Example 2:
//
// Input: nums = [1,3,2,1]
// Output: [1,3,2,1,1,3,2,1]
// Explanation: The array ans is formed by concatenating nums with itself:
// - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
// - ans = [1,3,2,1,1,3,2,1]

 

// Constraints:
// 1 <= nums.length <= 1000
// 1 <= nums[i] <= 1000

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int[] a = new int[nums.length + nums.length];

        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[i];
            a[i + nums.length] = nums[i];
        }

        return a;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        ConcatenationOfArray co = new ConcatenationOfArray();
        int[] result = co.getConcatenation(nums);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
