class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (String a,String b) ->  a.length()-b.length());
        Map<String,Integer> dp = new HashMap<>();
        int ans=1;
        for(String str: words){
                            int curr=1;

            if(str.length()==1){
                dp.put(str,1);
                continue;
            }
            StringBuilder sb = new StringBuilder(str);
            for(int i=0;i<str.length();i++){
                char c= sb.charAt(i);
                sb.deleteCharAt(i);
                curr=Math.max(curr,dp.getOrDefault(sb.toString(),0)+1);  
                sb.insert(i,c);
                
            }
            dp.put(sb.toString(),curr);
            ans= Math.max(curr,ans);
        }
        return ans;
    }
}