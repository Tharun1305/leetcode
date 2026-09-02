class Solution {
    public int subsetXORSum(int[] nums) {
       int xor=0;
       for(int x:nums) xor|=x;
       return xor*(1<<(nums.length-1)); 
    }
}