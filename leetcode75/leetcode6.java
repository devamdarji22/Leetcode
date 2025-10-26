// 🧩 Problem: Reverse Words in a String
// 🔗 Link   : https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            ans.append(words[i]).append(" ");
        }
        return ans.toString().trim();
    }
}