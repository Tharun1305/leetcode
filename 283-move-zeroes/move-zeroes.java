class Solution {
    public void moveZeroes(int[] nums) {
        for (int right = 0,left=0; right < nums.length; ++right) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                ++left;
            }
        }        
    }
}