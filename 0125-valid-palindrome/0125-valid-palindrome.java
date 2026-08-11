class Solution {
    public boolean revpalindrome(int i , String s){
        if(i>=s.length()/2){
            return true;
        }

        if(s.charAt(i)!= s.charAt(s.length()-i-1))return false;
        return revpalindrome(i+1,s.toLowerCase());
    }
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]", "");
        return revpalindrome(0,s.toLowerCase());
    }
}