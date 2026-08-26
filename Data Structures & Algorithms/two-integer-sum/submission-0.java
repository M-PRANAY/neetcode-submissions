class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(m.get(nums[i]) == null){
                m.put(nums[i],i);
            }
            int x = target-nums[i];
            if(m.get(x) != null){
                ans[1] = i;
                ans[0] = m.get(x);
            }
        }
        return ans;
    }
}
