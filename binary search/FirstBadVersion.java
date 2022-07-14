/*
 * Title: First Bad Version
 * 
 * Problem: You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your 
 * product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version 
 * are also bad. Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following 
 * ones to be bad. You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find 
 * the first bad version. You should minimize the number of calls to the API.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/13/2022
 * 
 * 
 * Solution: This problem presents a fun twist on a binary search. Since you're trying to find the first broken version, and every version 
 * after the first one returns as broken, so the goal is the use a binary search to find the leftmost True return or the rightmost False return.
 * I chose to use the leftmost True return.
 * Time Complexity: O(log(n))
 */





public class FirstBadVersion {

 /* The isBadVersion API is defined in the parent class VersionControl (This doesn't do anything, just used to get rid of the red squiqlies). */
    boolean isBadVersion(int version) {
        return true;
    }

    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low+(high-low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            }
            else {
                low = mid +1;
            }
        }
    return low;   
    }
}