import java.util.List;
import java.util.ArrayList;
/* 
 * Title: Letter Case Permutation
 * 
 * Problem: Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string. 
 * Return a list of all possible strings we could create. Return the output in any order.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/25/2022
 * 
 * Solution: DFS. Each level has two options either upper or lower case.
 * Time Complexity: O(2^n)
 */


public class LetterCasePermutations {
    public List<String> letterCasePermutation(String s) {
        List<String> permutations = new ArrayList<>();
        getPermutation(s.toCharArray(),permutations, 0);
        return permutations;
    }
    
    private void getPermutation(char[] chars, List<String> list, int i) {
        if (i == chars.length) list.add(new String(chars));
        else if (Character.isDigit(chars[i]))  getPermutation(chars, list, i + 1);
        else {
            chars[i] = Character.toLowerCase(chars[i]);
            getPermutation(chars, list, i + 1);

            chars[i] = Character.toUpperCase(chars[i]);
            getPermutation(chars, list, i + 1);
        }
    }
}
