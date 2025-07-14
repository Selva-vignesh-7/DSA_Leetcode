class Solution {
    static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Returns decimal value of roman numeral
    static int romanToInt(String s) {
        int res = 0; 

        for (int i = 0; i < s.length(); i++) {
            
            // Get value of current symbol
            int s1 = value(s.charAt(i));

            // Compare with the next symbol if it exists
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));

                // If current value is greater or equal, add it
                // to result
                if (s1 >= s2) {
                    res += s1;
                }
                else {
                    // Else, add the difference and skip next
                    // symbol
                    res += (s2 - s1);
                    i++;
                }
            }
            else {
                res += s1;
            }
        }

        return res;
}
}