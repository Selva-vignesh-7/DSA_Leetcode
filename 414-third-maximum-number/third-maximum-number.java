class Solution {
    public int thirdMax(int[] nums) {
        long Max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int num : nums) {
            if(Max < num) {
                thirdMax = secondMax;
                secondMax = Max;
                Max = num;
            }
            else if(secondMax < num && num != Max) {
                thirdMax = secondMax;
                secondMax = num;
            }
            else if(thirdMax < num && num != secondMax && num != Max)
                thirdMax = num;
        }

        if(thirdMax == Long.MIN_VALUE)
            return (int)Max;

        return (int)thirdMax;
    }
}