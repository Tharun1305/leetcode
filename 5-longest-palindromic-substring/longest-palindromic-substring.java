class Solution{
    public String longestPalindrome(String s){
        if(s==null||s.length()==0)
            return "";

        int start=0,end=0;

        for(int i=0;i<s.length();++i){
            int odd=expand(s,i,i);
            int even=expand(s,i,i+1);
            int len=Math.max(odd,even);

            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }

        return s.substring(start,end+1);
    }

    private int expand(String s,int l,int r){
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            --l;
            ++r;
        }

        return r-l-1;
    }
}