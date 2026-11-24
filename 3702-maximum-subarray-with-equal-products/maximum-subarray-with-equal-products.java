class Solution {
    private int gcd(int a, int b) {
        return b==0?a:gcd(b,a%b);
    }

    public int maxLength(int[] nums) {
        int n=nums.length,ans=1;
        final long LIMIT=25200;

        for(int i=0;i<n;++i){
            long prod=1;
            int g=0,l=1;
            for(int j=i;j<n;++j){
                prod*=nums[j];
                if(prod>LIMIT) break;
                g=gcd(g,nums[j]);
                l=l/gcd(l,nums[j])*nums[j];
                if(prod==(long)g*l) ans=Math.max(ans,j-i+1);
            }
        }

        return ans;
    }
}
