class Solution {
    public int removeElement(int[] nums, int val) {
        int c=-1;
        for(int i=0;i<nums.length;++i){
            if(nums[i]!=val) nums[++c]=nums[i];
        }
        return c+1;
    }
}