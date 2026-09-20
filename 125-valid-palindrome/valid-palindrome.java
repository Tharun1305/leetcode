class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")) return true;
        String str="";
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)) str+=Character.toLowerCase(ch);
        }
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            ++i;
            --j;
        }
        return true;
    }
}