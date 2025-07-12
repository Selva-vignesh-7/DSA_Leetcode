class Solution {
    static{
        for (int i = 0; i < 100; i++) {
            moveZeroes(new int[] { 0, 0 });
        }
    }
    public static void moveZeroes(int[] nums) {
        int index = 0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) {
                int curr = nums[i];
                nums[i] = 0;
                nums[index] = curr;
                index += 1;
            }
        } 
    }
}