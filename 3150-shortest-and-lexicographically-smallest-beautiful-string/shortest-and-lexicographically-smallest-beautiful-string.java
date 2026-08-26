import java.math.BigInteger;
class Solution {
    public String shortestBeautifulSubstring(String s,int k) {
        int n=s.length(),l=0,len=0,cnt1=0,minLen=n+1;
        BigInteger win=BigInteger.ZERO,xMin=null;
        for(int r=0;r<n;++r){
            int is1=s.charAt(r)-'0';
            win=win.shiftLeft(1).or(BigInteger.valueOf(is1));
            cnt1+=is1;
            ++len;
            while(cnt1>k||(cnt1==k&&s.charAt(l)=='0')){
                win=win.and(BigInteger.ONE.shiftLeft(len-1).subtract(BigInteger.ONE));
                --len;
                cnt1-=s.charAt(l)-'0';
                ++l;
            }

            if(cnt1==k){
                if(len<minLen){
                    minLen=len;
                    xMin=win;
                }
                else if(len==minLen&&win.compareTo(xMin)<0) xMin=win;
            }
        }
        if(xMin==null) return "";
        StringBuilder ans=new StringBuilder();
        for(int i=minLen-1;i>=0;--i) ans.append(xMin.testBit(i)?'1':'0');
        return ans.toString();
    }
}