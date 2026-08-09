class Solution {
    int[][] dp;
    int[] suffix;
    int n;

    public int stoneGameII(int[] piles) {
        n=piles.length;
        suffix=new int[n+1];

        for(int i=n-1;i>=0;--i)
            suffix[i]=suffix[i+1]+piles[i];

        dp=new int[n][n+1];

        for(int i=0;i<n;++i)
            java.util.Arrays.fill(dp[i],-1);

        return solve(0,1);
    }

    private int solve(int i,int m) {
        if(i>=n) return 0;

        if(dp[i][m]!=-1) return dp[i][m];

        if(2*m>=n-i)
            return dp[i][m]=suffix[i];

        int best=0;

        for(int x=1;x<=2*m && i+x<=n;++x) {
            int nm=Math.max(m,x);
            best=Math.max(best,suffix[i]-solve(i+x,nm));
        }

        return dp[i][m]=best;
}
}