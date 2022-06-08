class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder str = new StringBuilder(s);
        if(str.reverse().toString().equals(s)){
            return 1;
        }
        return 2;
    }
}