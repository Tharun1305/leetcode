class Solution{
    long gcd(long a,long b){
        while(b!=0){
            long t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public long findKthSmallest(int[] coins,int k){
        int n=coins.length;
        List<long[]> sub=new ArrayList<>();
        for(int mask=1;mask<(1<<n);++mask){
            long l=1;
            int cnt=0;
            for(int i=0;i<n;++i){
                if((mask&(1<<i))!=0){
                    ++cnt;
                    l=lcm(l,coins[i]);
                }
            }
            sub.add(new long[]{l,(cnt&1)==1?1:-1});
        }
        long lo=1;
        long mn=Integer.MAX_VALUE;
        for(int x:coins) mn=Math.min(mn,x);
        long hi=mn*k;
        while(lo<hi){
            long mid=lo+(hi-lo)/2;
            long cnt=0;
            for(long[] x:sub){
                if(x[0]<=mid) cnt+=x[1]*(mid/x[0]);
            }
            if(cnt>=k) hi=mid;
            else lo=mid+1;
        }
        return lo;
    }
}