package week_one.day_one;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = i+1, k = 1;
        while(j <= nums.length - 1) {
            if(nums[i] == nums[j]) {
                j++;
            } else {
                i = j;
                k++;
                j++;
                nums[k - 1] = nums[i];
            }
        }
        return k;
    }
}
