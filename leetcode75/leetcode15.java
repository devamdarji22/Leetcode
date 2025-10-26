// 🧩 Problem: Maximum Number of Vowels in a Substring of Given Length
// 🔗 Link   : https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int maxVowels(String s, int k) {
        int currVowels = 0;
        for(int i = 0;i<k;i++){
            if(isVowel(s.charAt(i))) currVowels++;
        }
        int maxVowels = currVowels;
        for(int i = k;i<s.length();i++){
            if(isVowel(s.charAt(i))) currVowels++;
            if(isVowel(s.charAt(i-k))) currVowels--;
            maxVowels = Math.max(currVowels, maxVowels);
        }
        return maxVowels;
    }
    boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' ||
                c=='o' || c=='u') return true;
        return false;
    }
}