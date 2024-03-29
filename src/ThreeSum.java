import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new LinkedList<>();
        Arrays.sort(nums); //Sort the array
        
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int lo = i+1;
                int hi = nums.length-1;
                int sum = 0-nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        ret.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    }
                    else if (nums[lo] + nums[hi] > sum) hi--;
                    else lo++;
                }
            }
        }
        return ret;
    }
}
