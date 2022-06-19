class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Map<String,Set<String>> map = new HashMap<>();
        for(String str: products){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                sb.append(str.charAt(i));
                if(map.containsKey(sb.toString())){
                    map.get(sb.toString()).add(str);
                }
                else{
                    map.put(sb.toString(),new TreeSet());
                    map.get(sb.toString()).add(str);
                }
            }
        }
        List<List<String>> ans = new ArrayList<>();
        StringBuilder sBuilder = new StringBuilder();
        for(int i=0;i<searchWord.length();i++){
            List<String> list = new ArrayList<>();
            sBuilder.append(searchWord.charAt(i));
            if(!map.containsKey(sBuilder.toString())){
                ans.add(list);
                continue;
            }
            Set<String> set = map.get(sBuilder.toString());
            if(set.size()>3){
                int j=0;
                for(String s :set){
                    if(j>=3){
                        break;
                    }
                    list.add(s);
                    j++;
                }
            }
            else{
                list.addAll(set);
            }
            ans.add(list);
        }
        return ans;
    }
}