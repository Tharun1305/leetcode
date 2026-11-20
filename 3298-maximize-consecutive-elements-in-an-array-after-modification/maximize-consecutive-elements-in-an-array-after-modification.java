class Solution {
    public int maxSelectedElements(int[] nums) {
        int ans=1,prev=Integer.MIN_VALUE,dp0=1,dp1=1;
        Arrays.sort(nums);
        for(int num:nums){
            if(num==prev) dp1=dp0+1;
            else if(num==prev+1){++dp0;++dp1;}
            else if(num==prev+2){dp0=dp1+1;dp1=1;}
            else {dp0=1;dp1=1;}
            ans=Math.max(ans,Math.max(dp0,dp1));
            prev=num;
        }
        return ans;
    }
}
