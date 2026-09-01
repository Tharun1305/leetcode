class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int nums[]=new int[friends.length];
        int k=-1;
        for(int i=0;i<order.length;++i){
            for(int j=0;j<friends.length;++j){
                if(order[i]==friends[j]){
                    nums[++k]=order[i];
                    break;
                }
            }
        }
        return nums;
    }
}