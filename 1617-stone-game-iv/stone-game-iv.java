class Solution{
    Boolean[] dp;
    public boolean winnerSquareGame(int n){
        dp=new Boolean[n+1];
        return dfs(n);
    }
    boolean dfs(int i){
        if(i==0) return false;
        if(dp[i]!=null) return dp[i];
        for(int j=1;j*j<=i;++j)
            if(!dfs(i-j*j)) return dp[i]=true;
        return dp[i]=false;
    }
}