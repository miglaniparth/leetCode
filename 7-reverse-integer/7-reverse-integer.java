class Solution {
    public int reverse(int x) {
       
        boolean isNegative=x<0?true:false;
        int ans=0;
        if(isNegative){
            x=-1*x;
        }
        while(x>0){
            if(ans>Integer.MAX_VALUE /10|| ans<Integer.MIN_VALUE/10){
            return 0;}
            ans*=10;
            ans+=x%10;
            x/=10;
            
        
        }
        if(isNegative){
            ans=-1*ans;
        }
        
        return ans;
    }
}