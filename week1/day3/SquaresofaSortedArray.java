package day3;

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int minsqr = 0;
        int i;
        int j;
        int k = 1;
        int[] sortedSquare = new int[nums.length];
        for(int l = 1;l < nums.length;l++) {
            if((nums[minsqr]*nums[minsqr]) > (nums[l]*nums[l])) {
                minsqr = l;
            }
        }
        sortedSquare[0] = nums[minsqr]*nums[minsqr];
        i = minsqr-1;
        j = minsqr+1;
        while(i >= 0 || j < nums.length) {
            if(i < 0) {
                sortedSquare[k] = nums[j]*nums[j];
                k++;
                j++;
            } else if(j >= nums.length) {
                sortedSquare[k] = nums[i]*nums[i];
                k++;
                i--;
            } else {
                if((nums[i]*nums[i] > nums[j]*nums[j])) {
                    sortedSquare[k] = nums[j]*nums[j];
                    k++;
                    j++;
                } else {
                    sortedSquare[k] = nums[i]*nums[i];
                    k++;
                    i--;
                }
            }
        }
        return sortedSquare;
    }
}