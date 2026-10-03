class Solution {
    public int largestAltitude(int[] gain) {
        int maxHeight=0,currHeight=0;
        for (int g:gain) {
            currHeight+=g;
            maxHeight=Math.max(maxHeight,currHeight);
        }
        return maxHeight;
    }
}