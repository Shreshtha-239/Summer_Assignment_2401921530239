package day2;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = 0;
        int maxele = nums[0];
        for(int i = 0;i < nums.length;i++) {
            sum += nums[i];
            if(sum < 0) {
                sum = 0;
            } else {
                maxsum = Math.max(maxsum, sum);
            }
        }
        for(int i = 1;i < nums.length;i++) {
            maxele = Math.max(maxele, nums[i]);
        }
        if(maxele >= 0) {
            return maxsum;
        } else {
            return maxele;
        }
    }
}