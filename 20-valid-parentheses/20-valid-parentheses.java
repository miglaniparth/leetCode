class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ){
                stack.push(s.charAt(i));
            }
            else if(stack.isEmpty()){
                return false;
            }
            if(s.charAt(i)==')'){
                if(stack.isEmpty() || stack.peek()!='(')
                    return false;
                stack.pop();
            }
            if(s.charAt(i)==']'){
                if(stack.isEmpty() || stack.peek()!='[')
                    return false;
                stack.pop();
            }
            if(s.charAt(i)=='}'){
                if(stack.isEmpty() || stack.peek()!='{')
                    return false;
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}