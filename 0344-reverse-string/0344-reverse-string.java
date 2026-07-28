class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] temp = new char[n];
        for(int i =0 ; i< n ; i++){
            temp[i]= s[i];
        }
        for(int i = 0 ; i< n ; i++){
            s[i]= temp[n-i-1];
        }System.out.print(s);
    }
}