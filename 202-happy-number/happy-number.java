class Solution {
    public boolean isHappy(int n) {
        int rem=0, sum = 0;
        if(n==1 || n==7) return true;
        else if(n==4 || n<10) return false;
        else{
        while(n>0){
            rem = n % 10;
            n = n / 10;
            sum += rem*rem;
        }
        
        return isHappy(sum);
        }
    }
}
