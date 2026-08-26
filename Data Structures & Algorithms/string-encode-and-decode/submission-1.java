class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(String s:strs){
            ans+="[" + s.length() + "]" + s;
        }
        return ans;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        for(int i=1;i<str.length();){
            String cnt = "";
            while(str.charAt(i) != ']'){
                cnt+=str.charAt(i);i++;
            }
            int s = Integer.parseInt(String.valueOf(cnt));
            i++;
            String temp = "";
            while(s-->0){
                temp+=str.charAt(i);
                i++;
            }
            ans.add(temp);
            i++;
        }
        return ans;
    }
}
