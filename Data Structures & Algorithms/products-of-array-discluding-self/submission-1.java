class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p[] = new int[nums.length];
        p[0] = nums[0];
        int s[] = new int[nums.length];
        s[nums.length-1] = nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            p[i] = p[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            s[i] = s[i+1]*nums[i];
        }
        for(int i=1;i<nums.length-1;i++){
            nums[i] = p[i-1]*s[i+1];
        }
        nums[0] = s[1];
        nums[nums.length-1] = p[nums.length-2];
        return nums;
    }
}  
