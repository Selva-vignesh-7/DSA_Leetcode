class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                xor = xor ^ nums[i];

            }
        }
        return xor;
    }
}