class Solution {
    void reveseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reveseArray(nums, 0 , n-1);
        reveseArray(nums, 0 , k-1);
        reveseArray(nums, k , n-1);
    }
}