class Solution {
    int binarySearch(int[] arr, int start, int end, int target){
        int mid= (start+end)/2;
        if((start>end || start<0 || end>arr.length-1) && arr[mid]!=target){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr,0,mid-1,target);
        }
        else{
            return binarySearch(arr,mid+1,end,target);
        }
    }
    public int search(int[] nums, int target) {
       return binarySearch(nums,0,nums.length-1,target);
    }
}