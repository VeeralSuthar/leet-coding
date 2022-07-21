import java.util.*;
/* Title: Middle of the Linked List
 * 
 * Problem: Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/20/2022
 * 
 * Solution: A moving window problem. j is used to track the upper bounds, and i is used to track the lower bounds of the substring.
 * Using a hashset to track the values and if a value is already in the hashset then that value is removed and i, the lower bound, is 
 * incremented.
 * Time Complexity: O(n)
 */

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else set.remove(s.charAt(i++));
        }
        return max;
    }
}
