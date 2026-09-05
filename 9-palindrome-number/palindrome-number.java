class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String s=String.valueOf(x),str="";
        for(int i=s.length()-1;i>=0;--i){
            str+=s.charAt(i);
        }
        return s.equals(str);
    }
}