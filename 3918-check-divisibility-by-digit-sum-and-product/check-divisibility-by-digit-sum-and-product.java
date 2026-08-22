class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0,mul=1;
        while(temp>0){
            sum+=temp%10;
            mul*=temp%10;
            temp/=10;
        }
        return n%(sum+mul)==0;
    }
}