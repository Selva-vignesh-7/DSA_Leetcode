class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        // int xor1 = 0, xor2 = 0;
        // for(int i=0; i<N; i++){
        //     xor2 = xor2 ^ nums[i];
        //     xor1 = xor1 ^ i;
        // }
        // xor1 = xor1 ^ N;
        // return xor1 ^ xor2;
        
        int v1 = N * ( N + 1 ) / 2;
        int v2 = 0;
        for(int i=0; i<N; i++){
            v2 += nums[i];
        }
        int res = v1 - v2;
        return res;
    }
}