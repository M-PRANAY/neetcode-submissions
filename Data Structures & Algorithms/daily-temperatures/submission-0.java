class Solution {
    public int[] dailyTemperatures(int[] t) {
        int ans[] = new int[t.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<t.length;i++){
            if(s.isEmpty()){
                s.push(i);
            } else{
                while(!s.isEmpty() && t[s.peek()] < t[i]){
                    int x = s.pop();
                    ans[x] = i-x;
                }
                s.push(i);
            }
        }
        return ans;
    }
}

