class Solution {
    public int reverseDegree(String s) {
       int ans=0;
       for(int i=0;i<s.length();++i){
        char ch=s.charAt(i);
        ans+=(i+1)*('z'-ch+1);
       } 
       return ans;
    }
}