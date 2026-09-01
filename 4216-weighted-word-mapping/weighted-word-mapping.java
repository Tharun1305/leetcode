class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                sum += weights[word.charAt(i) - 'a'];
            }
            
            int mod = sum % 26;
            char mappedChar = (char) ('z' - mod);
            result.append(mappedChar);
        }
        
        return result.toString();
    }
}