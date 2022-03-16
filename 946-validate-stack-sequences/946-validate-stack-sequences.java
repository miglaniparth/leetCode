class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        boolean ans=false;
        int pushPtr=0, popPtr=0;
        Stack<Integer> stack= new Stack<Integer>();
        while(true){
            if(!stack.isEmpty() && stack.peek()==popped[popPtr]){
                stack.pop();
                popPtr++;
            }
            else if(stack.isEmpty() && popPtr==popped.length && pushPtr==pushed.length){
                return true;
            }
            else if(pushPtr!=pushed.length && popPtr!=popped.length){
                stack.push(pushed[pushPtr]);
                pushPtr++;
            }
            else if(pushPtr==pushed.length && popPtr==popped.length ){
                return false;
            }
            else if(!stack.isEmpty() && stack.peek()!=popped[popPtr]){
                return false;
            }
        }
        // return ans;
    }
}