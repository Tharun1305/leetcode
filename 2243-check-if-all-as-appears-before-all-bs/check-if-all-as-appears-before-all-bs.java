class Solution {
    public boolean checkString(String s) {
        char x[] =s.toCharArray();
        Arrays.sort(x);
        int i=0;
        while(i<x.length) {
            if(x[i]!=s.charAt(i)) return false;
            ++i;
        }
        return true;
    }
}