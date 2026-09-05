class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char ch:n.toCharArray()){
            if(ch-'0'>max) max=ch-'0';
        }
        return max;
    }
}