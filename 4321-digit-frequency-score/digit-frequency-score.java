class Solution {
    public int digitFrequencyScore(int n) {
       int x=0;
       while(n>0){
        x+=n%10;
        n/=10;
       } 
       return x;
    }
}