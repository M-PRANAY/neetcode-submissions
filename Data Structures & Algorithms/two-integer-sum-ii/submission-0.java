class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<numbers.length;i++){
            if(m.get(target-numbers[i]) != null){
                ans[0] = m.get(target-numbers[i]) + 1;
                ans[1] = i+1;
            }
            m.put(numbers[i],i);
        }
        return ans;
    }
}
