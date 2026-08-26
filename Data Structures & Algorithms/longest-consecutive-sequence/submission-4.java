class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> m = new HashMap<>();
        int ans = 0;
        for(int i:nums){
            if(m.get(i-1) == null){
                m.put(i,1);
                if(ans == 0){ans = 1;}
            } else{
                m.put(i,m.get(i-1)+1);
                ans = Math.max(m.get(i),ans);
            }
        }
        return ans;

    }
}

class Pair{
    int a;
    int b;
    public Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
}
