class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(ans);
                ans=0;
            }
            if(s.charAt(i)==')'){
                ans=stack.pop()+Math.max(2*ans,1);
            }
        }
        return ans;
    }
}