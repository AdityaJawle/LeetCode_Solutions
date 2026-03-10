// Problem: Valid Anagram
// Link: https://leetcode.com/problems/valid-anagram/description/
// Difficulty: Easy
// Approach:
// - If the lengths of s and t are different, return false immediately.
// - Convert both strings to character arrays.
// - Sort the character arrays.
// - Compare the sorted arrays using Arrays.equals().
// - Return true if they are equal, false otherwise.
// - For Unicode characters, the same approach works, or you could use a HashMap to count character frequencies.

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?



import java.util.Arrays;
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }


    public static void main(String[] args) {
        String s = "eat";
        String t = "tea";
        
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram(s, t));
    }
}
