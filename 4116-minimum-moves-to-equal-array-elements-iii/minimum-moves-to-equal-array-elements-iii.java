class Solution {
    public int minMoves(int[] nums) {
        int m=0,c=0;
        for(int x:nums) m=Math.max(m,x);
        for(int x:nums){
            if(x==m) continue;
            while(x!=m) {
                ++x;
                ++c;
            }
        }
        return c;
    }
}