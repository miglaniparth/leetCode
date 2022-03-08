class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        int ans[]=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++){
            map.put(nums[i],i);
        }
        int j=0;
        for(int i: nums){
            if(map.containsKey(target-i) && map.get(target-i)!=j){
                ans[1]=map.get(target-i);
                ans[0]=j;
            }
            j++;
        }
        return ans;
    }
}