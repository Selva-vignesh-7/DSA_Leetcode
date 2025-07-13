class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for(int i:nums){
            s.add(i);
        }

        int index = 0;
        for(int i:s){
            nums[index] = i;
            index++;
        }

        //int k = nums.length;
        return index;
    }
}