public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;

        while (left < right) {
            int w = right-left;
            int h = Math.min(height[left],height[right]);
            int area = w * h;
            max = Math.max(max,area);
            if (height[left] < height[right]) left++;
            else if (height[right] < height[left]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
