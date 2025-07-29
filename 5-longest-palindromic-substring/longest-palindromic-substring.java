class Solution {
    public String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int currLength = 0, maxLength = 0;
        String maxString = "";
        for (int i = 0; i < ch.length; i++) {
            for (int j = i; j < ch.length; j++) {
                if (checkPalindrome(s, i, j)) {
                    currLength = j - i + 1;
                    if (maxLength < currLength) {
                        maxLength = currLength;
                        maxString = s.substring(i, j + 1);
                        System.out.println(maxString);
                    }

                }
            }
        }
        return maxString;
    }

    public boolean checkPalindrome(String s, int i, int j) {
        int start = i;
        int end = j;
        while (start <= end && end >= 0 && start <= s.length() - 1) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}