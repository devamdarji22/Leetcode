// 🧩 Problem: Is Subsequence
// 🔗 Link   : https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0,j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        if(s.length() == i) return true;
        return false;
    }
}