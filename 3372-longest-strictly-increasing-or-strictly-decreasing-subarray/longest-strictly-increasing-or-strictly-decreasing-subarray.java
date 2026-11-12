class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int curI = 1;
        int curD = 1;
        int ans = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]> nums[i-1]){
                curI++;
                curD = 1;
            }
            else if(nums[i]< nums[i-1]){
                curD++;
                curI = 1;
            }
            else{
                curI=1;
                curD=1;
            }
            ans = Math.max(ans,Math.max(curI,curD));
        }
        return ans;
    }
}
