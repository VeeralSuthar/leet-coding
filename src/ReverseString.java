/*
 * Title: Reverse String
 * 
 * Problem: Write a function that reverses a string. The input string is given as an array of characters s.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/18/2022
 * 
 * Solution: Use pointers at the beginning and end of the array and a temp variable to flip the string.
 * Time Complexity: O(n)
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int front = 0;
        int end = s.length-1;
        
        while (front <= end) {
            char temp = s[front];
            s[front] = s[end];
            s[end] = temp;
            front++;
            end--;
        }
    }
}
