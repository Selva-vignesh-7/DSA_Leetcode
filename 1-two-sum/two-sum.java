class Solution {
    // selva
    public int[] twoSum(int[] nums, int target) {

       Map<Integer, Integer> numToIndexMap = new HashMap<>();

       //get the size of the input array
       int size = nums.length;

       //loop through array
       for(int i=0; i<size; i++){
        //calculate the diff of the target and the current number
        int diff = target - nums[i];

        //check if the difference already exists in map
        if(numToIndexMap.containsKey(diff)){
            //if it exists, return the indices of current number
            return new int[]{i, numToIndexMap.get(diff)};
        }

        //if it doesn't exist, add the current number and its index
        numToIndexMap.put(nums[i], i);
       }

       //if no two numbers add up to the target, return null
       return null;
    }
}