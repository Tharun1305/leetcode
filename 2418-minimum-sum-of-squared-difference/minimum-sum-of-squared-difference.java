class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] d=new int[100002];
        long k=(long)k1+k2,sum=0;
        int max=0;

        for(int i=0;i<nums1.length;++i){
            int x=Math.abs(nums1[i]-nums2[i]);
            d[x]++;
            sum+=x;
            max=Math.max(max,x);
        }

        if(sum<=k) return 0;

        for(int i=max;i>0&&k>0;--i){
            if(d[i]==0) continue;
            long count=d[i];
            if(k>=count){
                d[i-1]+=count;
                d[i]=0;
                k-=count;
            } 
            else {
                d[i-1]+=k;
                d[i]-=k;
                k=0;
            }
        }

        long ans=0;
        for(int i=0;i<=max;++i){
            ans+=(long)i*i*d[i];
        }
        return ans;
    }
}
