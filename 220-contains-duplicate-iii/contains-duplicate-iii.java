class Solution{
    public boolean containsNearbyAlmostDuplicate(int[] nums,int indexDiff,int valueDiff){
        if(indexDiff<=0||valueDiff<0) return false;
        TreeSet<Long> window=new TreeSet<>();
        for(int i=0;i<nums.length;++i){
            if(i>indexDiff) window.remove((long)nums[i-indexDiff-1]);
            long x=nums[i];
            long low=x-(long)valueDiff;
            long high=x+(long)valueDiff;
            Long candidate=window.ceiling(low);
            if(candidate!=null&&candidate<=high) return true;
            window.add(x);
        }
        return false;
    }
}