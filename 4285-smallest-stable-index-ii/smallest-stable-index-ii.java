class Solution {
    public int firstStableIndex(int[] nums,int k) {
        int n=nums.length;
        int idx=0,max=Integer.MIN_VALUE,pmax=Integer.MIN_VALUE;
        for(int i=0;i<n;++i){
            max=Math.max(max,nums[i]);
            if(i==idx) pmax=Math.max(pmax,nums[i]);
            if(nums[i]<pmax-k){
                idx=i+1;
                pmax=max;
            }
        }
        return idx<n?idx:-1;
    }
}