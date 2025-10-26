// 🧩 Problem: Merge Strings Alternately
// 🔗 Link   : https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder ans = new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));

        }
        while(i<word1.length()){
            ans.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            ans.append(word2.charAt(j++));
        }
        return ans.toString();
    }
}