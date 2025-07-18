class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        int maxi=0;
        //Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            maxi = Math.max(maxi, nums[i]);
        }
        int hash[] = new int[maxi+1];
        //int hash[] = new int[51] // for limited constraints
        for(int i=0; i<nums.length; i++){
            
            hash[nums[i]]++;
        
            if(hash[nums[i]] > 1){
                xor = xor ^ nums[i];
                hash[nums[i]]--;
            }
        }
        return xor;
    }
}