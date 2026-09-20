class Solution {
    public int reverseDegree(String s) {
        int res=0,i=1;
        while(i<=s.length()){
            char c=s.charAt(i-1);
            res+=(i*('z'-c+1));
            ++i;
        }
        return res;
    }
}