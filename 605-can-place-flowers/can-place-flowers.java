class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n<=0) return true;
        for(int i=0;i<flowerbed.length;++i){
            boolean left=i==0||flowerbed[i-1]==0,right=i==flowerbed.length-1||flowerbed[i+1]==0;
            if(left&&right&&flowerbed[i]==0){
                flowerbed[i]=1;
                --n;
                if(n<=0) return true;
            }
        }
        return n<=0; 
    }
}
