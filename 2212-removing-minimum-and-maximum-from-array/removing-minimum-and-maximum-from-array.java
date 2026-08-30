class Solution {
    public int minimumDeletions(int[] nums) {
        int x=0,y=0,n=nums.length,max=nums[0],min=nums[0];
        for(int i=1;i<n;++i){
            if(nums[i]<min){
                 min=nums[i];
                 x=i;
            }
            if(nums[i]>max) {
                max=nums[i];
                y=i;
            }
        }
        int a=Math.min(x,y);
        int b=Math.max(x,y);
        return Math.min(b+1,Math.min(n-a,a+1+n-b));
    }
}