package day2;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<Integer>();
        for(int i = 0;i < nums.length;i++) {
            arr.add(nums[i]);
        }
        return nums.length != arr.size();
    }
}