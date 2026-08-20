class Solution {

    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k<0)k+=nums.length;
        reveseArray(nums, 0 , nums.length-1);
        reveseArray(nums, 0 , k-1);
        reveseArray(nums, k , nums.length-1);
    }
       private void reveseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}