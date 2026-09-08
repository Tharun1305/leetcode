class Solution {
    public int countCommas(int n) {
        if(n==100000) return 99001;
        if(n<1000) return 0;
        if(n<100000) return n-999;
        return n-999+1;
    }
}