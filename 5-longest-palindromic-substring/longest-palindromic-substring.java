class Solution {
    public String longestPalindrome(String s) {

        int currLength = 0, maxLength = Integer.MIN_VALUE, len = s.length();
        String maxString = "";
        for (int i = 0; i < len ; i++) {
            for (int j = i; j < len; j++) {
                if (checkPalindrome(s, i, j)) {
                    currLength = j - i + 1;
                    if (maxLength < currLength) {
                        maxLength = currLength;
                        maxString = s.substring(i, j + 1);
                    }

                }
            }
        }
        return maxString;
    }

    public boolean checkPalindrome(String s, int i, int j) {
        int start = i;
        int end = j;
        while (start <= end && end >= 0 && start < s.length()) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

        // String str = s.substring(i, j + 1);
        // StringBuilder sb = new StringBuilder(str);
        // String revString = sb.reverse().toString();
        // if(revString.equals(str)) return true;
        // return false;
        // gives TLE because of creating string builder object using forloop multiple times
    }
}