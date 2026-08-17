class Solution{
    int[] pre;

    private int solve(int l,int r,int[][] dp){
        if(dp[l][r]!=-1)
            return dp[l][r];

        int best=0;

        for(int i=l+1;i<=r;++i){
            int left=pre[i-1]-(l>0?pre[l-1]:0);
            int right=pre[r]-pre[i-1];

            if(left<right)
                best=Math.max(best,left+solve(l,i-1,dp));
            else if(right<left)
                best=Math.max(best,right+solve(i,r,dp));
            else
                best=Math.max(best,left+Math.max(solve(l,i-1,dp),solve(i,r,dp)));
        }

        return dp[l][r]=best;
    }

    public int stoneGameV(int[] stoneValue){
        int n=stoneValue.length;
        pre=new int[n];
        int[][] dp=new int[n][n];

        for(int[] row:dp)
            Arrays.fill(row,-1);

        pre[0]=stoneValue[0];

        for(int i=1;i<n;++i)
            pre[i]=pre[i-1]+stoneValue[i];

        return solve(0,n-1,dp);
    }
}