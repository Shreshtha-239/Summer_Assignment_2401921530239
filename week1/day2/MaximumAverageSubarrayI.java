package day2;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int j = 0; j < k;j++) {
            sum += nums[j];
        }
        double maxavg = sum/k;
        for(int i = k;i < nums.length;i++) {
            sum = sum - nums[i-k] + nums[i];
            maxavg = Math.max(sum/k, maxavg);
        }
        return maxavg;
    }
}