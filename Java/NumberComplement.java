// Problem: Number Complement
// Link: https://leetcode.com/problems/number-complement/description/
// Difficulty: Easy
// Approach:
// - Convert the integer to its binary string representation.
// - Flip each bit (0 to 1 and 1 to 0).
// - Convert the flipped binary string back to an integer and return the result.


// The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

// For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
// Given an integer num, return its complement.

 

// Example 1:

// Input: num = 5
// Output: 2
// Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
// Example 2:

// Input: num = 1
// Output: 0
// Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 

// Constraints:

// 1 <= num < 231


public class NumberComplement {
        public int findComplement(int num) {
        String bs = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < bs.length(); i++){
            char ch = bs.charAt(i);

            char flip = (ch == '0') ? '1' : '0';

            sb.append(flip);
        }

        int newVal = Integer.parseInt(sb.toString(), 2);
        return newVal;
    }

    public static void main(String[] args){
        int nums = 5;

        NumberComplement m = new NumberComplement();
        System.out.println(m.findComplement(nums));
    }
}
