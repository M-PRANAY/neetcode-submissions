class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> m = new HashMap<>();
        for(char c:s.toCharArray()){
            if(m.get(c) == null){m.put(c,0);}
            m.put(c,m.get(c)+1);
        }
        for(char c:t.toCharArray()){
            if(m.get(c) == null){return false;}
            m.put(c,m.get(c)-1);
            if(m.get(c) == 0){m.remove(c);}
        }
        if(m.keySet().size()>0){return false;}
        return true;
    }
}
