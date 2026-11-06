class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs,Comparator.comparingInt(r->r[1]));
        Integer[] order=new Integer[queries.length];
        Arrays.setAll(order,i->i);
        Arrays.sort(order,Comparator.comparingInt(i->queries[i]));

        int[] cnt=new int[n+1],ans=new int[queries.length];
        int busy=0,lo=0,hi=0,m=logs.length;
        
        for(int i:order){
            int q=queries[i];
            while(hi<m&&logs[hi][1]<=q){
                if(cnt[logs[hi][0]]++==0) ++busy;
                ++hi;
            }
            while(lo<m&&logs[lo][1]<q-x){
                if(--cnt[logs[lo][0]]==0) --busy;
                ++lo;
            }
            ans[i]=n-busy;
        }
        return ans;
    }
}