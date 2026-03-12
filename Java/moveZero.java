// Problem: Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/description/
// Difficulty: Easy
// Approach:
// - Initialize a pointer k = 0 to track the position for the next non-zero element.
// - Traverse the array using a loop.
// - If the current element is not zero, place it at index k and increment k.
// - After moving all non-zero elements, fill the remaining positions in the array with 0.
// - Finally, print the modified array elements sequentially.

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]
 

// Constraints:

// 1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1
 

// Follow up: Could you minimize the total number of operations done?





public class moveZero {
    public void moveZeroes(int[] nums) {
        int k =0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }

        while(k < nums.length){
            nums[k] = 0;
            k++;
        }

        for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
        }

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};


        moveZero mz = new moveZero();
        mz.moveZeroes(nums);
    }
}