class Solution {
    public int missingMultiple(int[] nums, int k) {
        int x=k;
        while(true){
          boolean res=false;
          for(int num:nums){
            if(num==x){
                res=true;
                break;
            }
          }
          if(!res) return x;
          x+=k;
        }
    }
}