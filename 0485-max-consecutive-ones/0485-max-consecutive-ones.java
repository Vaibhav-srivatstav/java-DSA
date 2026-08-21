class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0 ;
        int temp= 0;
        for(int n: nums){
            if(n==1)temp++;
            else temp = 0;
            count= Math.max(count, temp);
        }return count;
    }
}