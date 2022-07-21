/*
 * Title: Reverse Words in A String
 * 
 * Problem: Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/18/2022
 * 
 * Solution: Using 2 pointers, the end pointer is used to find a white space and then from front to end you have 1 word. you can then run that word
 * through the reverse(char[] str, int front, int end) function. This runs until the end pointer reaches the end of the string. You then run this one
 * more time to reverse that last word.
 * Time Complexity: O(n)
 */

public class ReverseWordsInAString3 {
    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int front = 0;
        int end = 0;
        
        for (; end < charArray.length; end++) {
            if(charArray[end] == ' ') {
                reverse(charArray,front,end-1);
                front = end+1;
            }
        }
        reverse(charArray,front,end-1);
        return new String(charArray);
    }
    private void reverse(char[] str, int front, int end) {
        while (front <= end) {
            char temp = str[front];
            str[front] = str[end];
            str[end] = temp;
            front++;
            end--;
        }
    }
}
