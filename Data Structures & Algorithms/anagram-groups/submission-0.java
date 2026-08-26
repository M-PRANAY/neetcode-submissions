class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String s:strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);
            if(m.get(s1) == null){
                m.put(s1,new ArrayList<>());
            }
            m.get(s1).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s:m.keySet()){
            ans.add(m.get(s));
        }
        return ans;
    }
}
