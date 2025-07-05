class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], maxsum = nums[0];
        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
}