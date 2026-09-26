// Problem: Set Mismatch
// Link: https://leetcode.com/problems/set-mismatch/
// Difficulty: Easy
// Approach:
// - Create a count array to keep track of how many times each number appears.
// - Traverse through nums and increment the count of each number.
// - Traverse from 1 to n:
//   - If a number appears twice, it is the duplicate.
//   - If a number appears zero times, it is the missing number.
// - Return the duplicate and missing number as an array.
//
// The set originally contains all integers from 1 to n.
// Due to an error, one number is duplicated and another number is missing.
//
// Given an integer array nums representing the set after the error,
// find the number that occurs twice and the number that is missing.
//
// Example 1:
//
// Input: nums = [1,2,2,4]
// Output: [2,3]
//
// Explanation:
// The number 2 occurs twice and the number 3 is missing.
//
// Example 2:
//
// Input: nums = [1,1]
// Output: [1,2]
//
// Explanation:
// The number 1 occurs twice and the number 2 is missing.
//
// Constraints:
// 2 <= nums.length <= 10^4
// 1 <= nums[i] <= 10^4


public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        int[] count = new int[nums.length + 1];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) {
                result[0] = i;
            } else if (count[i] == 0) {
                result[1] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 6};

        SetMismatch sm = new SetMismatch();

        int[] result = sm.findErrorNums(nums);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
