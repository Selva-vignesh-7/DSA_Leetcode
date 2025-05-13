class Solution {
    public void moveZeroes(int[] nums) {
        int j=0, temp=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            
        }
        return;
    }
}