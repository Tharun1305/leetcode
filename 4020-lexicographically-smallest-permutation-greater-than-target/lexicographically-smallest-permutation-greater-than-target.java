class Solution{
    public String lexGreaterPermutation(String s,String target){
        int n=s.length();
        int[] cnt=new int[26];
        for(char c:s.toCharArray())
            ++cnt[c-'a'];
        for(int i=n-1;i>=0;--i){
            int[] rem=cnt.clone();
            boolean ok=true;
            for(int j=0;j<i;++j){
                int c=target.charAt(j)-'a';
                if(rem[c]==0){
                    ok=false;
                    break;
                }
                --rem[c];
            }
            if(!ok) continue;
            int cur=target.charAt(i)-'a';
            for(int c=cur+1;c<26;++c){
                if(rem[c]==0) continue;
                StringBuilder ans=new StringBuilder(target.substring(0,i));
                ans.append((char)('a'+c));
                --rem[c];
                for(int x=0;x<26;++x){
                    while(rem[x]-->0) ans.append((char)('a'+x));
                }
                return ans.toString();
            }
        }
        return "";
    }
}