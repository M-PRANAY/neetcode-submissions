class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int ans = 0;
        while(l<r){
            ans = Math.max(ans,sum(heights,l,r));
            if(heights[l] < heights[r]){
                l++;
            }
            else {
                r--;
            }
        }
        return ans;
    }

    public int sum(int arr[], int i, int j){
        return (j-i) * Math.min(arr[i],arr[j]);
    }
}
