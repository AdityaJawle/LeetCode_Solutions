// Problem: Find Unique Binary String
// Link: https://leetcode.com/problems/find-unique-binary-string/description/
// Difficulty: Medium
// Approach:
// - Use Cantor’s diagonalization method:
//   Flip the i-th character of the i-th string to generate a new string.
// - This guarantees the new string is not in the original array.
// - Efficient for n <= 16 as per constraints.

// Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.

 

// Example 1:

// Input: nums = ["01","10"]
// Output: "11"
// Explanation: "11" does not appear in nums. "00" would also be correct.
// Example 2:

// Input: nums = ["00","01"]
// Output: "11"
// Explanation: "11" does not appear in nums. "10" would also be correct.
// Example 3:

// Input: nums = ["111","011","001"]
// Output: "101"
// Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.
 

// Constraints:

// n == nums.length
// 1 <= n <= 16
// nums[i].length == n
// nums[i] is either '0' or '1'.
// All the strings of nums are unique.
public class FindUniqueBinaryString {

    public String findDiff(String[] nums){
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            char ch = nums[i].charAt(i);

            char flip = (ch == '0') ? '1' :'0';

            rev.append(flip);

        }

        return rev.toString();
    }

    public static void main(String[] args) {
        String[] nums = {"001", "101", "111"};

        FindUniqueBinaryString rev = new FindUniqueBinaryString();
        System.out.print(rev.findDiff(nums));
    }
}
