/*
 * Title: Climbing Stairs
 * 
 * Problem: You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/26/2022
 * 
 * 
 * Solution: Bottom-up Dynamic Programming using memoization. 
 * * * * Tried my best to explain how I simplified this problem here: https://tinyurl.com/2etnsm2a
 * Time Complexity: O(n)
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int s1 = 1;
        int s2 = 1;
        
        for (int i = 0; i < n-1; i++) {
            int temp = s1;
            s1 = s1 +s2;
            s2 = temp;
        }
        return s1;
    }
}
