package day3;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxarea = Math.min(height[i], height[j])*(j-i);
        while(i < j) {
            if(height[i] < height[j]) {
                i++;
                maxarea = Math.max(maxarea, Math.min(height[i], height[j])*(j-i));
            } else {
                j--;
                maxarea = Math.max(maxarea, Math.min(height[i], height[j])*(j-i));
            }
        }
        return maxarea;
    }
}