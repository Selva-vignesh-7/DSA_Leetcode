class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, max=0, index=0, res = 0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                count++;
                if(count>res){
                    max = count;
                    index = i;
                    res = max;
                }
            }else{
                count=1;
                max=1;
            }

        }
        return (int)nums[index];
    }
}