class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;++i){
            if(nums[i]!=nums[i-1]){
                nums[++c]=nums[i];
            }
        }
        return 1+c;
    }
}