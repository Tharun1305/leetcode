class Solution {
    public int mirrorDistance(int n) {
        int x=0,t=n;
        while(t>0){
            x=x*10+t%10;
            t/=10;
        }
        return Math.abs(x-n);
    }
}