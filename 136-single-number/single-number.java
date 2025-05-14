class Solution {
    public int singleNumber(int[] nums) {
      Arrays.sort(nums);
      for(int i=1;i<nums.length;i++)
      {
        if(nums[i-1]!=nums[i])
        {
        return nums[i-1];
        }
        i++;
      }
    return nums[nums.length-1];
    }
}