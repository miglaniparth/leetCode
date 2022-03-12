class Solution {
    public int numOfOne(int x){
        int count=0;
        while(x>0){
            if(x%2==1){
                count++;
            }
            x/=2;
        }
        return count;
    }
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=numOfOne(i);
        }
        return arr;
    }
}