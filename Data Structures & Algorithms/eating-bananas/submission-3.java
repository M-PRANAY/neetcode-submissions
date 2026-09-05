class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int sum = 0;
        for(int i:piles){
            sum=Math.max(i,sum);
        }
        int l = 1;
        int r = sum;
        while(l<=r){
            int mid = l+ (r-l)/2;
            if(f(mid, piles) <= h){
                r = mid-1;
            } else if(f(mid, piles) > h){
                l = mid+1;
            }
        }
        return l;
    }

    public int f(int mid,int piles[]){
        int ans = 0;
        for(int i:piles){
            ans+=i/mid;
            ans+=i%mid == 0? 0 : 1;
        }
        return ans;
    }
}
