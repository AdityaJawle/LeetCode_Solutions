// Problem: Merge Strings Alternatively
// Link: https://leetcode.com/problems/merge-strings-alternately/description/
// Difficulty: Easy
// Approach:
// - Iterate up to the maximum length of the two strings.
// - Append characters alternately from each string if available.
// - If one string is longer, append the remaining characters at the end.

// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

 

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s
// Example 3:

// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d
 

// Constraints:

// 1 <= word1.length, word2.length <= 100
// word1 and word2 consist of lowercase English letters.

public class MergeStringAlternatively{
    public static void main(String[] args) {
        String a = "abcd";
        String b = "pqr";

        for(int i = 0; i < Math.max(a.length(), b.length()); i++){
            if (i < a.length()) {
                System.out.print(a.charAt(i));
            }
            if (i < b.length()) {
                System.out.print(b.charAt(i));
            }
        }
    }
}