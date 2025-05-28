class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        // l * b = height * index
        int left = 0, right = n-1;
        while(left<right){
            max = Math.max(max, (right-left) * Math.min(height[left],height[right]));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}