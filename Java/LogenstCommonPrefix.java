// Problem: Longest Common Prefix
// Link: https://leetcode.com/problems/longest-common-prefix/description/
// Difficulty: Easy
// Approach: 
// - Sort the array of strings.
// - Compare the first and last strings character by character.
// - Return the common prefix between them.
// - This works because sorting brings the strings with minimal common prefix to the ends.
// Q. Logenst Common Prefix

// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters if it is non-empty.

import java.util.*;

public class LogenstCommonPrefix {

    public String longPre(String[] str){
       if (str == null || str.length == 0) {
        return "";
       }

       Arrays.sort(str);

       String first = str[0];
       String last  = str[str.length-1];

       int i = 0;
       while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
        i++;
       }


       return first.substring(0, i);
    }
    public static void main(String[] args) {
        
        String[] str = {"dog","racecar","car"};

        LogenstCommonPrefix p = new LogenstCommonPrefix();
        System.out.println(p.longPre(str));
    }
}