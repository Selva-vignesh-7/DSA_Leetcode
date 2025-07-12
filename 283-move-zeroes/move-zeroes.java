class Solution {
    public void moveZeroes(int[] nums) {
        
        int j=0, index;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                index = nums[i];
                nums[i] = 0;
                nums[j] = index;
                j++;
            }
            
        }
        
        return;
    }
}