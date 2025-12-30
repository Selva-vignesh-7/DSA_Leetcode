public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int i=0;
        for(int j=i+1; j<nums.Length; j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }


        } 
        return (i+1);
    }
}