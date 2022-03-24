class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;
 
        int start=0;
        int end=people.length-1;
        
        while(start<=end){
            if(people[start]+people[end]<=limit){
                start++;
                end--;
            }
            else{
                end--;
            }
            boats++;
        }
        // while(!list.isEmpty()){
        //     int key=list.get(0);
        //     Integer value= null;
        //     for(int i=list.size()-1;i>0;i--){
        //         if(key+list.get(i)<=limit){
        //             value=list.get(i);
        //             break;
        //         }
        //     }
        //     list.remove(0);
        //     if(value!=null){
        //         list.remove(new Integer(value));
        //     }
        //     boats++;
        // }
       
        return boats;
    }
}