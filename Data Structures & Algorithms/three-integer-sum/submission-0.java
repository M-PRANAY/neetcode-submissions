class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int[] temp = new int[3];
            twoSum(temp,nums, -nums[i], i+1,ans,set);
        }
        return ans;
    }

    public void twoSum(int ans[], int[] nums, int target, int index, List<List<Integer>> res, Set<String> set){
        Set<Integer> s = new HashSet<>();
        for(int i=index;i<nums.length;i++){
            int v = target-nums[i];
            if(s.contains(v)){
                ans[0] = nums[i];
                ans[1] = v;
                ans[2] = -target;
                Arrays.sort(ans);
                String str = Arrays.stream(ans)
                   .mapToObj(String::valueOf)
                   .collect(Collectors.joining());
                if(set.contains(str)){
                    continue;
                }
                List<Integer> l = new ArrayList<>();
                l.add(ans[0]);
                l.add(ans[1]);
                l.add(ans[2]);
                res.add(l);
                set.add(str);
            }
            s.add(nums[i]);
        }
        return ;
    }
}
