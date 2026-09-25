// Problem: Shuffle the Array
// Link: https://leetcode.com/problems/shuffle-the-array/description/
// Difficulty: Easy
// Approach:
// - Create a new array of the same size as nums.
// - The first n elements of nums are x1, x2, ..., xn.
// - The next n elements are y1, y2, ..., yn.
// - Place nums[i] at the even index 2 * i.
// - Place nums[i + n] at the odd index 2 * i + 1.
// - Return the new array.

// Given the array nums consisting of 2n elements in the form
// [x1,x2,...,xn,y1,y2,...,yn].
//
// Return the array in the form
// [x1,y1,x2,y2,...,xn,yn].
//
// In other words, we need to shuffle the array by taking one element
// from the first half and then one element from the second half.

 

// Example 1:
//
// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7]
// Explanation:
// - x1 = 2, x2 = 5, x3 = 1
// - y1 = 3, y2 = 4, y3 = 7
// - ans = [x1,y1,x2,y2,x3,y3]
// - ans = [2,3,5,4,1,7]

// Example 2:
//
// Input: nums = [1,2,3,4,4,3,2,1], n = 4
// Output: [1,4,2,3,3,2,4,1]
// Explanation:
// - x1 = 1, x2 = 2, x3 = 3, x4 = 4
// - y1 = 4, y2 = 3, y3 = 2, y4 = 1
// - ans = [x1,y1,x2,y2,x3,y3,x4,y4]
// - ans = [1,4,2,3,3,2,4,1]

// Example 3:
//
// Input: nums = [1,1,2,2], n = 2
// Output: [1,2,1,2]
// Explanation:
// - x1 = 1, x2 = 1
// - y1 = 2, y2 = 2
// - ans = [x1,y1,x2,y2]
// - ans = [1,2,1,2]

 

// Constraints:
// 1 <= n <= 500
// nums.length == 2n
// 1 <= nums[i] <= 10^3

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[nums.length];

        for (int i = 0; i < n; i++) {
            a[2 * i] = nums[i];
            a[2 * i + 1] = nums[i + n];
        }

        return a;
    }

    public static void main(String[] args) {

        int n = 3;

        int[] nums = {2, 5, 1, 3, 4, 7};

        ShuffleTheArray sf = new ShuffleTheArray();
        int[] result = sf.shuffle(nums, n);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
