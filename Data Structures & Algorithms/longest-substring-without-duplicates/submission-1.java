class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){return 0;}
        if(s.length() == 1){return 1;}
        int l = 0;
        int r = 1;
        int ans = 1;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(l));
        while(r<s.length()){
            if(set.contains(s.charAt(r))){
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            ans = Math.max(ans,r-l+1);
            set.add(s.charAt(r));
            r++;
        }
        return ans;
    }
}
