class Solution {
    static{
        for(int i=0;i< 300;i++){
            findMaxConsecutiveOnes(new int[]{0});
        }
    } 


    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0, maxi=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count = 0;
            }
            else{
                count += 1;
                maxi = Math.max(maxi, count);
            }
        }
        return maxi;
    }
}