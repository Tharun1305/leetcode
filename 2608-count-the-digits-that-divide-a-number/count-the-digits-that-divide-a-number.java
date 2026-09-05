class Solution {
    public int countDigits(int num) {
        int n=num,c=0;
        while(n>0){
            int d=n%10;
            if(num%d==0) ++c;
            n/=10;
        }
        return c;
    }
}