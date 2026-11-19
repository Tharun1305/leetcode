class Solution {
    public int minimizeSum(int[] nums) {
        int sm1=Integer.MAX_VALUE,sm2=Integer.MAX_VALUE,sm3=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;++i){
            int x=nums[i];
            if(x>max3){
                if(x>max2){
                    if(x>max1){max3=max2;max2=max1;max1=x;}
                    else {max3=max2;max2=x;}
                }
                else max3=x;
            }
            if(x<sm3){
                if(x<sm2){
                    if(x<sm1){sm3=sm2;sm2=sm1;sm1=x;}
                    else {sm3=sm2;sm2=x;}
                }
                else sm3=x;
            }
        }
        return Math.min(Math.min(max1-sm3,max3-sm1),max2-sm2);
    }
}
