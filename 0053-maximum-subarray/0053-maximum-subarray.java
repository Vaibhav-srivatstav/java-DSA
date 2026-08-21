class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        long count = Integer.MIN_VALUE;
        long temp = 0;
        for(int i =0 ; i< n ; i++){   
            temp +=nums[i];
            if(count<temp){
                count = temp;
            }  
            if(temp <0){
                temp=0;
            }
            
        }return (int)count;
    }
}