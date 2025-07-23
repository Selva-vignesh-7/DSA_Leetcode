class Solution {
    public boolean isAnagram(String s, String t) {
        int[] hash = new int[26];
        int flag = 0;
        for(char c1 : s.toCharArray()){
            hash[c1 - 'a']++;
        }
        for(char c2 : t.toCharArray()){
            hash[c2 - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(hash[i] != 0){
                return false;
            }
        }
        return true;
    }
}