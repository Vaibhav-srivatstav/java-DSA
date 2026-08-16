class Solution {
    public int maxFrequency(int[] nums, int k) {
        int ans = 0;
        long count = 0;
        Arrays.sort(nums);
        for(int l=0,r=0;r<nums.length; ++r){
            count+=nums[r];
            while(count+k<(long)nums[r]*(r-l+1)){
                count-=nums[l++];
            }ans = Math.max(ans,r-l+1);
        }return ans;
    }
}