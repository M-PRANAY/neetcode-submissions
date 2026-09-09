class Solution {
    public int maxProfit(int[] prices) {
        int p[] = new int[prices.length];
        p[0] = prices[0];
        for(int i=1;i<p.length;i++){
            p[i] = Math.min(prices[i],p[i-1]);
        }
        int max = prices[prices.length-1];
        int ans = 0;
        for(int i=prices.length-2;i>=0;i--){
            int temp = max - p[i];
            ans = Math.max(ans,temp);
            max = Math.max(max,prices[i]);
        }
        return ans;

    }
}
