class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n)) return false;
            set.add(n);
            int s=0;
            while(n>0){
                int d=n%10;
                s+=d*d;
                n/=10;
            }
            n=s;
        }
        return true;

    }
}