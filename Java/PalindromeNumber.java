// Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/description/
// Difficulty: Easy
// Approach:
// - If the number is negative, it cannot be a palindrome.
// - Reverse the integer by extracting digits and reconstructing the number.
// - Compare the reversed number with the original.
// - Returns true if they are equal, false otherwise.
// - This avoids converting the number to a string.

// Given an integer x, return true if x is a palindrome, and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1
 

// Follow up: Could you solve it without converting the integer to a string?
public class PalindromeNumber {

    public boolean isPal(int x){
        if (x < 0) return false;
        
        int y = x;
        int rev = 0;

        while (x > 0) {
                int d = x % 10;
                rev = rev * 10 + d;
                x = x / 10;
        }

        return y == rev; 
    }
    public static void main(String[] args) {
        int x = 121;

        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPal(x));
    }
    
}
