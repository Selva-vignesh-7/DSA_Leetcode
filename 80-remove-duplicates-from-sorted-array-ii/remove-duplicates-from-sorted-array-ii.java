class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1, flag=0;
        for(int i=1; i<nums.length; i++){

            if(nums[i] == nums[i - 1]){
                flag++;
                if(flag>1) continue;
            }
            
            if(nums[i] != nums[i-1]) {
                flag=0;    
            }
            nums[j] = nums[i];
            j++;
            
        }
        return j;
    }
    
}