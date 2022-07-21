/*
 * TITLE: Permutation in String
 * 
 * PROBLEM: Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise. In other words, 
 * return true if one of s1's permutations is the substring of s2.
 * 
 * AUTHOR: Veeral Suthar
 *
 * DATE: 07/20/2022
 * 
 * SOLUTION: This one was a bit of a doozy for me. Used a moving window on s2 and tracked the count of each number in a int array. As long
 * as the value of the index is equal in map1 and map2 you know that the permutation is valid.
 * TIME COMPLEXITY: O(n)
 */

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()) return false;
        
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        for(int i = 0;i < s1.length();i++) {
        map1[s1.charAt(i)-'a']++;
        map2[s2.charAt(i)-'a']++;    
        }
        for(int i = s1.length();i < s2.length(); i++) {
            if(match(map1, map2)) return true;
            map2[s2.charAt(i)-'a']++;
            map2[s2.charAt(i-s1.length())-'a']--;
        }
        return match(map1,map2);
    }
        static boolean match(int[] s1map,int[] s2map){
        for(int i=0;i<26;i++){
            if(s1map[i]!=s2map[i]) return false;
        }
        return true;
    }
}
