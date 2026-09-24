class Solution {
    public int maxFreqSum(String s) {
        int c=0,v=0;
        Map<Character,Integer> fre=new HashMap<>();
        for(char ch:s.toCharArray()) fre.put(ch,fre.getOrDefault(ch,0)+1);
        for(Map.Entry<Character,Integer> entry:fre.entrySet()){
            char ch=entry.getKey();
            int cnt=entry.getValue();
            if("aeiou".indexOf(ch)>=0) v=Math.max(v,cnt);
            else c=Math.max(c,cnt);
        }
        return v+c;
    }
}