// 🧩 Problem: Reverse Vowels of a String
// 🔗 Link   : https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/1484457247/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] word = s.toCharArray();
        String vowels="aeiouAEIOU";
        while(start<end){
            while(start<end &&
                    vowels.indexOf(word[start]) == -1){
                start++;
            }
            while(start<end &&
                    vowels.indexOf(word[end]) == -1){
                end--;
            }
            char temp = word[end];
            word[end] = word[start];
            word[start] = temp;

            start++;
            end--;
        }
        return new String(word);
    }
}