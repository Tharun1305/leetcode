class Solution {
    public long removeZeros(long n) {
        long res=0,x=0;
        while(n!=0){
            if(n%10==0) n/=10;
            else{
            res=res*10+n%10;
            n/=10;
            }
        }
        while(res!=0){
            x=x*10+res%10;
            res/=10;
        }
        return x;
    }
}