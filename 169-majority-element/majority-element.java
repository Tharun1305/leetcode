class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        int res=0,majority=0;
        for (int n:nums) {
            hash.put(n,1+hash.getOrDefault(n,0));
            if (hash.get(n)>majority) {
                res=n;
                majority=hash.get(n);
            }
        }

        return res;
    }
}