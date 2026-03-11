// Problem: Complement of Base 10 Integer
// Link: https://leetcode.com/problems/complement-of-base-10-integer/description/
// Difficulty: Easy
// Approach:
// - Convert the integer to its binary string representation.
// - Flip each bit (0 to 1 and 1 to 0).
// - Convert the flipped binary string back to an integer and return the result.

// The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

// For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
// Given an integer n, return its complement.

 

// Example 1:

// Input: n = 5
// Output: 2
// Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
// Example 2:

// Input: n = 7
// Output: 0
// Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
// Example 3:

// Input: n = 10
// Output: 5
// Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
 

// Constraints:

// 0 <= n < 109
 

public class ComplementBase10Integer {


    public int bitwiseComplement(int n) {
        String bs = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < bs.length(); i++) {
            char ch = bs.charAt(i);

            char flip = (ch == '0') ? '1' :'0';
            sb.append(flip);
        }

        int newVal = Integer.parseInt(sb.toString(),2);
        return newVal;
    }

    
    public static void main(String[] args) {
        int n = 42;
        

        ComplementBase10Integer cb = new ComplementBase10Integer();
        System.out.println(cb.bitwiseComplement(n));
        
    }
}