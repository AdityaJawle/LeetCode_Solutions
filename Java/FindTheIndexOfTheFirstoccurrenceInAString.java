// Problem : Find the Index of the First occurrence in a String
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=programming-skills
// Difficulty: Easy
// Approach:
// - Iterate through the `haystack` string, from index 0 to `haystack.length() - needle.length()`.
// - For each index, extract a substring of length equal to `needle` using `haystack.substring(i, i + needle.length())`.
// - Compare the extracted substring with `needle` using the `equals()` method.
// - If a match is found, return the current index `i`.
// - If no match is found after checking all substrings, return -1 to indicate that `needle` is not present in `haystack`.



// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

// Constraints:

// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.

public class FindTheIndexOfTheFirstoccurrenceInAString{

    public int strStr(String haystack, String needle){
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";

        FindTheIndexOfTheFirstoccurrenceInAString p = new FindTheIndexOfTheFirstoccurrenceInAString();
        System.out.println(p.strStr(haystack, needle));

    }
}