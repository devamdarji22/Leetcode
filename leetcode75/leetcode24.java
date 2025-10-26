// 🧩 Problem: Removing Stars From a String
// 🔗 Link   : https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='*') stack.pop();
            else stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c: stack){
            sb.append(c);
        }
        return sb.toString();
    }
}