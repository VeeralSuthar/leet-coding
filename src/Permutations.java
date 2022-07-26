import java.util.ArrayList;
import java.util.List;
/*
 * TITLE: Permutations
 * 
 * PROBLEM: Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 * 
 * AUTHOR: Veeral Suthar
 *
 * DATE: 07/25/2022
 * 
 * SOLUTION: Backtrack solution. 
 * TIME COMPLEXITY: O(n!)
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(nums,new ArrayList<Integer>(),permutations);
        return permutations;
    }
    
    private void backtrack(int[] nums, List<Integer> perm, List<List<Integer>> permutations) {
        System.out.println(perm);
        if (perm.size() == nums.length) {
            permutations.add(new ArrayList<>(perm));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (perm.contains(nums[i])) continue;
                perm.add(nums[i]);
                backtrack(nums, perm, permutations);
                perm.remove(perm.size() - 1);
            }
        }
    }
}
