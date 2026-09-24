class Solution {
    public int minElement(int[] nums) {
     for(int i=0;i<nums.length;++i){
        int sum=0,j=nums[i];
        while(j!=0){
            sum+=j%10;
            j/=10;
        }
        nums[i]=sum;
     } 
     int min=Integer.MAX_VALUE;  
     for(int num:nums) min=Math.min(num,min);
     return min;
    }
}