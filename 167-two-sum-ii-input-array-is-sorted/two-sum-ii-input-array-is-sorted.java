class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1, sum=0;
        while(left < right){
            sum = numbers[left] + numbers[right];
            if(sum == target) return new int[] {left+1, right+1};
            else if(sum < target) left++;
            else right--;
        }  
        return new int[]{-1, -1};
    }
}