class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        String str[]=s.split(" ");
        String res="";
        for(int i=str.length-1;i>=0;--i){ 
        if(str[i].equals("")) continue; 
        else if(i==0) res+=str[i];
        else res+=(str[i]+" ");
        }
        return res;
    }
}