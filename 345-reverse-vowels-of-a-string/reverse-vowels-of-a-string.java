class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels=new ArrayList<>();
        String vStr="aeiouAEIOU";
        for(int i=0;i<s.length();++i){
            char ch=s.charAt(i);
            if(vStr.indexOf(ch)!=-1) vowels.add(ch);
        }
        StringBuilder result=new StringBuilder();
        int idx=vowels.size()-1;
        for(int i=0;i<s.length();++i){
            char ch=s.charAt(i);
            if(vStr.indexOf(ch)!=-1) result.append(vowels.get(idx--));
            else result.append(ch);
        }
        return result.toString();
    }
}
