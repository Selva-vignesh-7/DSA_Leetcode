class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int r = k%n ;

        reverse(nums, 0, n-1);
        reverse(nums, 0, r-1);
        reverse(nums, r, n-1);
    }
    public void reverse(int[] nums, int a, int b){
        int start = a, end = b;
        
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
    }

}

// class Solution {
//     public void rotate(int[] nums, int k) {
//         k = k%nums.length ;
//         reverse(0,nums.length-1,nums);
//         reverse(0,k-1,nums);
//         reverse(k,nums.length-1,nums);
//     }
//     void reverse(int s,int e,int[] nums){
//         while(s<=e){
//             // System.out.println(s+" "+e);
//             int temp = nums[s];
//             nums[s] = nums[e];
//             nums[e] = temp;
//             s++;
//             e--;
//         }
//     }
// }