class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracStack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(')
                bracStack.push(')');
            else if(c == '[')
                bracStack.push(']');
            else if(c == '{')
                bracStack.push('}');
            else if(bracStack.isEmpty() || bracStack.pop() != c)
                return false;
        }
        return bracStack.isEmpty();
    }
}
