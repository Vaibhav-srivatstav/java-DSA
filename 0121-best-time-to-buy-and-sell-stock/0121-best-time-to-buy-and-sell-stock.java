class Solution {
    public int maxProfit(int[] prices) {
        int p = Integer.MAX_VALUE;
        int ans = 0;
        for(int num : prices){
            if(num<p){
                p = num;
            }
            else{
                ans = Math.max(ans, num-p);
            }
        }return ans;
    }
}