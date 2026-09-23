class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length,total=0;
        for(int num:nums) total+=num;
        int target=total-x;

        if(target<0) return -1;
        if(target==0) return n;

        int left=0,sum=0,longest=-1;
        for(int right=0;right<n;++right){
            sum+=nums[right];
            while(left<=right&&sum>target){
                sum-=nums[left];
                ++left;
            }
            if(sum==target) longest=Math.max(longest,right-left+1);
        }

        return longest==-1?-1:n-longest;
    }
}
