class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int ans=0;
        for(int ele : nums){
            if(map.containsKey(ele)){
                ans= ele;
                break;
            }
            else{
                map.put(ele,1);
            }
        }
        return ans;
    }
}