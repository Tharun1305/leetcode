class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='['||ch=='{'||ch=='(') stack.push(ch);
            else{
                if(stack.isEmpty()) return false;
                char c=stack.pop();
                if(c=='{'&&ch!='}') return false;
                if(c=='('&&ch!=')') return false;
                if(c=='['&&ch!=']') return false;
            }
        }
        return stack.isEmpty();
    }
}