class Solution {
    public String simplifyPath(String path) {
        path=path.replace("//","/");
        Stack<String> stack = new Stack<>();
        String[] arr= path.split("/");
        for(String str: arr){
            if(str.equals("..")){
                if(!stack.isEmpty())
                stack.pop();
            }
            else if(str.equals(".")){
                continue;
            }
            else if(str.equals("")){
                continue;
            }
            else{
                stack.push(str);
            }
        }
        String ans="";
        if(stack.isEmpty()){
            return "/";
        }
        while(!stack.isEmpty()){
            ans="/"+stack.pop()+ans;
        }
        // if(ans.charAt(ans.length()-1)=='/'){
        //     ans=ans.substring(0,ans.length()-1);
        // }
        return ans;
    }
}