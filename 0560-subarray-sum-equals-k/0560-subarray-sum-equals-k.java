class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> p = new HashMap<>();
        int pre = 0;
        int count =0 ;
        p.put(0,1);
        for(int i = 0; i<n ; i++){
            pre+=nums[i];
            int re = pre-k;
            if(p.containsKey(re)){
                count+= p.get(re);
            }
            p.put(pre, p.getOrDefault(pre,0)+1);
        }
return count;

    }
}