class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int pidx =0;
        int nidx =0;
        for(int i =0 ; i< n ; i++){
            if(nums[i]>0)pos[pidx++]=nums[i];
            else neg[nidx++]= nums[i];
        }
        for(int i =0 ; i<n/2 ; i++){
            nums[i*2]= pos[i];
            nums[i*2+1]=neg[i];
        }return nums;
    }
}