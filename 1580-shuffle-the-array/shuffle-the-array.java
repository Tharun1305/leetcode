class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i+=2){
            arr[i]=nums[k];
            arr[i+1]=nums[k+n];
            ++k;
        }
        return arr;
    }
}