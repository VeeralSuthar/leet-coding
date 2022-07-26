import java.util.ArrayList;
import java.util.List;
/*
 * Title: Combinations
 * 
 * Problem: Given two integers n and k, return all possible combinations of k numbers out of the range [1, n]. You may return
 * the answer in any order.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/25/2022
 * 
 * 
 * Solution: Backtracking solution. Utilizing the combinations formula C(n,k) = n!/k!(n-k)!.
 * Time Complexity: O(log(n))
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(1,n,k,new ArrayList<>(),combinations);
        return combinations;
    }
    
    private void backtrack(int start, int n, int k, List<Integer> comb, List<List<Integer>> combinations) {
        if (k == 0) {
            combinations.add(new ArrayList<Integer>(comb));
            return;
        }
        for (int i = start; i <= n-k+1; i++) {
            comb.add(i);
            backtrack(i+1,n,k-1,comb,combinations);
            comb.remove(comb.size()-1);
        }
    }
}
