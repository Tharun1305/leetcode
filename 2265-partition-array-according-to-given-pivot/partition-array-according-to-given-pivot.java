class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] num=new int[nums.length];
        int l=0,r=nums.length-1,i=0,j=nums.length-1;
        while(i<nums.length){
            if(nums[i]<pivot) num[l++]=nums[i];
            if(nums[j]>pivot) num[r--]=nums[j];
            ++i;
            --j;
        }
        while(l<=r) num[l++]=pivot;
        return num;
    }
}