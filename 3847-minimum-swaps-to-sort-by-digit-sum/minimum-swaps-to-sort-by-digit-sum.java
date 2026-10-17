import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        long[][] elements=new long[n][3];
        for(int i=0;i<n;++i){
            elements[i][0]=digitSum(nums[i]);
            elements[i][1]=nums[i];
            elements[i][2]=i;
        }
        
        Arrays.sort(elements,(a,b)->{
            if(a[0]!=b[0]) return Long.compare(a[0],b[0]);
            if(a[1]!=b[1]) return Long.compare(a[1],b[1]);
            return Long.compare(a[2],b[2]);
        });
        
        int[] home=new int[n];
        for(int k=0;k<n;++k) home[(int)elements[k][2]]=k;

        int swaps=0;
        for(int i=0;i<n;++i){
            while(home[i]!=i){
                int j=home[i];
                home[i]=home[j];
                home[j]=j;
                ++swaps;
            }
        }
        return swaps;
    }

    private int digitSum(int x) {
        int s=0;
        for(;x>0;x/=10) s+=x%10;
        return s;
    }
}
