class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i = 0;
        while (n > 0 && i < len) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if (i == len - 1 || flowerbed[i + 1] != 1) {
                n--;
                i += 2;
            } else {
                i++;
            }
        }
        return n <= 0;
    }
}