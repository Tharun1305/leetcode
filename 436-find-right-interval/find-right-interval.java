public class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] result=new int[intervals.length];
        NavigableMap<Integer,Integer> intervalMap=new TreeMap<>();
        for(int i=0;i<intervals.length;++i) intervalMap.put(intervals[i][0],i);    
        for(int i=0;i<intervals.length;++i){
            Map.Entry<Integer,Integer> entry=intervalMap.ceilingEntry(intervals[i][1]);
            result[i]=(entry!=null)?entry.getValue():-1;
        }
        return result;
    }
}
